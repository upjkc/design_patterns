package Kompozyt;

public class Kompozyt {
    public static void main(String[] args) {

        Pudlo Duze = new Pudlo("Na lodówke","Duże");

        Pudlo SrednieSze = new Pudlo("Na wzmacniacz","Srednie Szerokie");

        Pudlo MaleWys = new Pudlo("Na małą lodówke","Małe wysokie");

        Pudlo male1 = new Pudlo("Na telefon","Małe");
        Pudlo male2 = new Pudlo("Na kosmetyki","Małe");

        Pudlo srednie1 = new Pudlo("Na pizze","Srednie");
        Pudlo srednie2 = new Pudlo("Na ubrania","Srednie");

        Duze.add(SrednieSze);
        Duze.add(MaleWys);

        SrednieSze.add(srednie1);
        SrednieSze.add(srednie2);

        MaleWys.add(male1);
        MaleWys.add(male2);

        System.out.println(Duze);

        for (Pudlo headEmployee : Duze.getZamowienie()) {
        System.out.println(headEmployee);

        for (Pudlo employee : headEmployee.getZamowienie()) {
        System.out.println(employee);
}
}
}
}
