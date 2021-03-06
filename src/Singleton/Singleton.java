package Singleton;

public final class Singleton {
    private static final Singleton INSTANCE = new Singleton();

    private Singleton() {}

    public static Singleton getInstance() {
        return INSTANCE;
    }

    public void showMessage(){
        System.out.println("Jest super");
    }

}
