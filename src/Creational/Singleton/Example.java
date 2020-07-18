package Creational.Singleton;

public class Example {
    public static void main(String[] args) {
        Runtime singleton = Runtime.getRuntime();
        singleton.gc();
        System.out.println(singleton);
        Runtime anotherSingleton = Runtime.getRuntime();
        System.out.println(anotherSingleton);
        if(singleton==anotherSingleton){
            System.out.println("They are same");
        }
    }
}
