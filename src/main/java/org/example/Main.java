package org.example;

import java.util.stream.Stream;

public class Main{
    public static void main(String[] args) {


        Integer[] ass = {12,1,5,6,7,15};
        String[] names = {"Magnus", "Kevin", "Hama"};



        GenericUtility integerUtil = new GenericUtility<>(ass);
        GenericUtility stringUtil = new GenericUtility<>(names);

        
        integerUtil.findMaximum();
        integerUtil.getMaximumValue();

        stringUtil.contains("Void");
        stringUtil.contains("Magnus");
    }
}