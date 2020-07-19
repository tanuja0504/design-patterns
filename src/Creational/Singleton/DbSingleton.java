package Creational.Singleton;

public class DbSingleton {
    //Private Static instance
    //Volatile threads can use a method and instance of the classes at the same time without any problem
    private static volatile DbSingleton instance = null;

    //Private Constructor
    private DbSingleton() {
        //Avoid reflection
        if (instance != null) {
            throw new RuntimeException("Use getInstance() method to create");
        }
    }

    //How to access object
    //method is not synchronized to optimize performance
    public static DbSingleton getInstance() {
        if (instance == null) {
            //may be null but two threads can access
            synchronized (DbSingleton.class) {
                //thread safe
                if (instance == null) {
                    instance = new DbSingleton();
                }
            }
        }

        return instance;
    }
}
