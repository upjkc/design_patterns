package Dekorator;
import java.util.Scanner;


public class Main {


    public static void main(String[] args){

        Scanner scan = new Scanner(System.in);

        Komputer PC = new pl_glowna();


        System.out.println(" ");
        System.out.println("Wybierz komponenty do swojego laptopa (uwaga plyta glowna to intel)");
        System.out.println("Podaj ktory z procesorow ma byc w twoim laptopie(1 lub 2):");
        System.out.println("1.Intel CORE i5");
        System.out.println("2.Intel CORE i7");
        int odp_1 = scan.nextInt();
        switch (odp_1) {
            case 1:
                PC = new proc_one(PC);
            break;
            case 2:
                PC = new proc_two(PC);
            break;
        }
        System.out.println("Podaj ,ktora pamiec RAM ma byc w twoim laptopie(1 lub 2):");
        System.out.println("1. 8GB");
        System.out.println("2. 16GB");
        int odp_2=scan.nextInt();
        switch (odp_2) {
            case 1:
                PC = new ram_one(PC);
                break;
            case 2:
                PC = new ram_two(PC);
                break;
        }
        System.out.println("Podaj ,ktora karta graficzna ma byc w twoim laptopie(1 lub 2):");
        System.out.println("1. RTX3060");
        System.out.println("2. GTX1650");
        int odp_3=scan.nextInt();
        switch (odp_3) {
            case 1:
                PC = new graf_one(PC);
                break;
            case 2:
                PC = new graf_two(PC);
                break;
        }
        System.out.println("Podaj ,ktory dysk twardy ma byc w twoim laptopie(1 lub 2):");
        System.out.println("1. 500GB");
        System.out.println("2. 1000GB");
        int odp_4=scan.nextInt();
        switch (odp_4) {
            case 1:
                PC = new dysk_one(PC);
                break;
            case 2:
                PC = new dysk_two(PC);
                break;
        }
        System.out.println("Wybierz ,ktory chcesz monitor(1 lub 2):");
        System.out.println("1. 15' ");
        System.out.println("2. 17' ");
        int odp_5=scan.nextInt();
        switch (odp_5) {
            case 1:
                PC = new mon_one(PC);
                break;
            case 2:
                PC = new mon_two(PC);
                break;
        }

        System.out.println(" ");
        System.out.println("Komputer komponenty: "+PC.Name());
        System.out.println("Komputer cena finalna: "+PC.Cost());

    }

}

