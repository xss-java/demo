package com.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class HelloWorld {

    public static void main(String[] args) {
        List list = new ArrayList<>();
        list.add(10);
        list.add(8);
        list.add(15);
//        for(int i =0;i<list.size();i++){
//            System.out.println(list.get(i));
//        }

        Collections.sort(list);
        list.forEach(value -> System.out.println(value));

    }
}
