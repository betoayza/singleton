package com.singleton;

public class Main {

    public static void main (String []args){
        Singleton singleton = Singleton.getInstance();
        Singleton singleton2 = Singleton.getInstance();
        System.out.println(singleton + "\n" + singleton2);
    }
}
