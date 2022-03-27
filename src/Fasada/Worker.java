package Fasada;

public class Worker {
    public static String giveLaptop(LaptopType laptoptype){
        Piece piece = new Piece();

        switch (laptoptype){
            case Laptop:
                PC laptop = new Laptop();
                String LaptopComp = piece.getLaptopComponents();
                laptop.createLaptop(LaptopComp);
                return laptop.sendLaptop();

            case Laptop_op2:
                PC laptop_op2 = new Laptop_op2();
                String LaptopComp_op2 = piece.getLaptop_op2Components();
                laptop_op2.createLaptop(LaptopComp_op2);
                return laptop_op2.sendLaptop();
        }
        return null;
    }
}
