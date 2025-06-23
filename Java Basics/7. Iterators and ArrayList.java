package org.example;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        ArrayList listTest = new ArrayList();
        listTest.add("first item");
        listTest.add("second item");
        listTest.add("third item");
        listTest.add(7);
        System.out.println(listTest.remove(1));
        Iterator it = listTest.iterator();
        System.out.println(it.next());
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        }
    }
