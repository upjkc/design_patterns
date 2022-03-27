package Dekorator;


public class proc_two extends KomputerDecorator {

    public proc_two(Komputer komp) {
        super(komp);
    }
    @Override
    public double Cost(){
        return super.Cost() + 1676;
    }

    @Override
    public String Name() {
        return super.Name() + " Procesor - Intel CORE i7, ";
    }
}
