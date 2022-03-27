package Dekorator;

public class graf_two extends KomputerDecorator {
    public graf_two(Komputer komp) {
        super(komp);
    }
    @Override
    public double Cost(){
        return super.Cost() + 1449;
    }

    @Override
    public String Name() {
        return super.Name()+ " Karta graficzna - GTX1650, ";
    }
}
