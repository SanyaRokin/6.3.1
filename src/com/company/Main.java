package com.company;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        List<Integer> eventList= new ArrayList<>(intList.size());
        for (Integer i : intList) {
            if (i > 0) {
                if(i % 2 == 0)
                eventList.add(i);
            }
        }
        Collections.sort(eventList);
        System.out.println(eventList);
    }

}
