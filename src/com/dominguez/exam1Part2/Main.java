package com.dominguez.exam1Part2;
import java.util.*;

public class Main {
    static List<String> combine(List<String> firstList, List<String> secondList) {
        List<String> newList = new ArrayList<String>();
        newList.addAll(firstList);
        newList.addAll(secondList);
        for (String city : newList) {
            System.out.println(city);
        }
        return newList;
    }

}

