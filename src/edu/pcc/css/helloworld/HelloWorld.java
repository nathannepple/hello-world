package edu.pcc.css.helloworld;

import java.util.Date;

public class HelloWorld {
    public static void main (String []args){
        System.out.println("Hello, World!");
        System.out.println (new Date());

        int countTo = 5; //counts to 5
            for (int i = 1; i <= countTo; i++) {
                System.out.println(i);
            }
    }


}
