package org.example.day3task;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class BubbleSort {
    ArrayList<Integer> intArray ;

    public BubbleSort(ArrayList<Integer> intArray) {
        this.intArray = intArray;
    }

    public ArrayList<Integer> sortArray(){
        System.out.println("Array Before Sorted : " + this.intArray.toString());
        int temp;
        boolean swapped;
        for(int i = 0 ; i < this.intArray.size() -1 ; i++){
            swapped = false;
            for (int j =0; j<this.intArray.size()-i-1 ;j++){
                if (this.intArray.get(j) > this.intArray.get(j+1)){
                    temp = this.intArray.get(j);
                    this.intArray.set(j,this.intArray.get(j+1));
                    this.intArray.set(j+1,temp);
                    swapped = true;

                }
            }

            if (swapped == false){
                break;
            }
        }
        System.out.println("The array after sorted : "+ this.intArray.toString());
        return this.intArray;
    }


}
