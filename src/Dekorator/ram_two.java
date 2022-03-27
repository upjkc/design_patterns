package Dekorator;

public class ram_two extends KomputerDecorator {
    public ram_two(Komputer pizza) {
        super(pizza);
    }
    @Override
    public double Cost(){
        return super.Cost() + 645;
    }

    @Override
    public String Name() {
        return super.Name()+ " RAM - 16GB, ";
    }
}
