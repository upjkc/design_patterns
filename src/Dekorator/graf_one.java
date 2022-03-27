package Dekorator;

public class graf_one extends KomputerDecorator {
    public graf_one(Komputer komp) {
        super(komp);
    }
    @Override
    public double Cost(){
        return super.Cost() + 3649;
    }

    @Override
    public String Name() {
        return super.Name()+ " Karta graficzna - RTX3060, ";
    }
}
