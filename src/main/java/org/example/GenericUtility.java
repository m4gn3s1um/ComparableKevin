package org.example;

import java.util.Arrays;

public class GenericUtility<T extends Comparable<T>> {

   private T maximumValue;
   private T[] array;


    public GenericUtility(T[] arr){
       this.array = arr;
   }


    public T findMaximum(){

        maximumValue = array[0];

       for (int i = 0; i < array.length; i++) {
           if(array[i].compareTo(maximumValue) > 0)
               maximumValue = array[i];
       }
        return maximumValue;
    }

    public T getMaximumValue(){

        System.out.println(maximumValue);
        return maximumValue;
    }

    public boolean contains(T value){

        boolean result = Arrays.stream(array).anyMatch(element -> element.equals(value));
        System.out.println(result);
        return result;
    }
}
