package Creational.Singleton;

import Creational.Singleton.DbSingleton;

import java.util.ArrayList;
import java.util.List;

public class DbSingletonObject {
    public static void main(String[] args) {
        List<DbSingleton> list = new ArrayList<>();
        int i = 0;
        while (i < 10000) {
            list.add(DbSingleton.getInstance());
            i++;
        }
        //Not Allowed in Singleton Pattern
        //DbSingleton object3=new DbSingleton();
        for (DbSingleton a : list
                ) {
            System.out.println(a);
        }
    }
}
