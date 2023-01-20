package com.example.retrofitfuturestudio;

import java.util.ArrayList;

public class ArrayPractice {

    public static void main(String[] args) {
        int umair[] = {10,20,30};
        System.out.println(umair[0]);

        ArrayList p = new ArrayList();
        p.add(3);
        p.add("123");
        p.add(1);
        p.add(3);

      for(Object o : p){
            System.out.println("Object is " + o);
        };
    }
}
