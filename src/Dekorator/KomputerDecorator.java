package Dekorator;

public class KomputerDecorator extends Komputer {

    protected Komputer _komp;

    public KomputerDecorator(Komputer komp){
        _komp = komp;
    }
    @Override
    public double Cost() {
        return _komp.Cost();
    }

    @Override
    public String Name() {
        return _komp.Name();
    }
}
