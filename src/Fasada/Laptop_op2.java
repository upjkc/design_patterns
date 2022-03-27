package Fasada;

public class Laptop_op2 implements PC{

    public String LaptopDone;
    @Override
    public void createLaptop(String components) {
        LaptopDone="Laptop MSI z podanymi komponentami: "+components;
    }

    @Override
    public String sendLaptop() {
        return LaptopDone;
    }
}

