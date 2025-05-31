package Recursion;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        methodOne();
    }

    public static void methodOne(){
        methodTwo();
        System.out.println("method1");
    }


    public static void methodTwo(){
        methodThree();
        System.out.println("method2");
    }

    public static void methodThree(){
        System.out.println("method3");
    }

}
