package com.singleton;

public class Main {

    public static void main (String []args){
        Singleton car1 = Singleton.getInstance();
        Singleton car2 = Singleton.getInstance();
        Singleton car3 = Singleton.getInstance();
        System.out.println(car1 + "\n" + car2 + "\n" + car3);
    }
}
