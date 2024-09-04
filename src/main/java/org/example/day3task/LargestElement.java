package org.example.day3task;

import java.util.List;

public class LargestElement {
    List<Integer> inputList;

    public LargestElement(List<Integer> inputList) {
        this.inputList = inputList;
    }

    public void findLargest(){
        int large =0;

        for(int i = 0 ; i < inputList.size();i++){
            if(this.inputList.get(i)>large){
                large = this.inputList.get(i);

            }
        }
        System.out.println("The largest number from array is : " + large);
    }
}
