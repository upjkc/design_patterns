package Builder;

public class Main {
    public static void main(String[] args) {
        Gitara Stratocaster = new Gitara().marka("Fender").typGitary("Stratocaster").kolor("fiesta red").drewnoKorpus("klon").drewnoPodstrunnica("klon")
        .przetworniki("single coil").klucze("fender locking tuners").struny("ernie ball 10-46");
        System.out.println(Stratocaster.getSklad());

        Gitara Telecaster = new Gitara().marka("Fender").typGitary("Telecaster").kolor("seafoam blue").drewnoKorpus("klon").drewnoPodstrunnica("klon")
        .przetworniki("single coil").klucze("fender locking tuners").struny("ernie ball 9-42");
        System.out.println(Telecaster.getSklad());

        Gitara LesPaul = new Gitara().marka("Gibson").typGitary("singlecut").kolor("goldtop").drewnoKorpus("Mahoń").drewnoPodstrunnica("Palisander")
        .przetworniki("Humbacker").klucze("Gibson vintage tuners").struny("ernie ball 10-52");
        System.out.println(LesPaul.getSklad());
    }
}
