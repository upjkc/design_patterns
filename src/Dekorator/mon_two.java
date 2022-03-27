package Dekorator;

public class mon_two extends KomputerDecorator {
    public mon_two(Komputer komp) {
        super(komp);
    }
    @Override
    public double Cost(){
        return super.Cost() + 758;
    }

    @Override
    public String Name() {
        return super.Name()+ " Monitor - 17' .";
    }
}
