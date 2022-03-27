package Dekorator;

public class proc_one extends KomputerDecorator {

    public proc_one(Komputer pizza) {
        super(pizza);
    }
    @Override
    public double Cost(){
        return super.Cost() + 769;
    }

    @Override
    public String Name() {
        return super.Name() + " Procesor - Intel CORE i5, ";
    }
}
