package Fasada;

public class Laptop implements PC{

    public String LaptopDone;
    @Override
    public void createLaptop(String components) {
    LaptopDone="Laptop Asus z podanymi komponentami: "+components;
    }

    @Override
    public String sendLaptop() {
        return LaptopDone;
    }
}
