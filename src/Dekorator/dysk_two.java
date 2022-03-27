package Dekorator;

public class dysk_two extends KomputerDecorator {
    public dysk_two(Komputer komp) {
        super(komp);
    }
    @Override
    public double Cost(){
        return super.Cost() + 519;
    }

    @Override
    public String Name() {
        return super.Name()+ " Dysk Twardy - 1000GB, ";
    }
}
