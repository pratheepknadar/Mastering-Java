package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;



public class Main {


    public static void main(String[] args) {

        int a = 110;
        int b = 10;
        int result = MaxFunction(a,b);
        System.out.println(result);
        }

    public static int MaxFunction(int a , int b){
        int max;
        if (a > b )
            max = a;
        else
            max = b;

        return max;

    }
}
