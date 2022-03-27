package Dekorator;

public class dysk_one extends KomputerDecorator {
    public dysk_one(Komputer komp) {
        super(komp);
    }
    @Override
    public double Cost(){
        return super.Cost() + 265;
    }

    @Override
    public String Name() {
        return super.Name()+ " Dysk Twardy - 500GB, ";
    }
}
