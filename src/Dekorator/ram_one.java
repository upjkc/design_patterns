package Dekorator;

public class ram_one extends KomputerDecorator {
    public ram_one(Komputer pizza) {
        super(pizza);
    }
    @Override
    public double Cost(){
        return super.Cost() + 225;
    }

    @Override
    public String Name() {
        return super.Name()+ " RAM - 8GB, ";
    }
}
