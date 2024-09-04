package org.example.day3task;

import java.util.ArrayList;

public class Fibonacci {
    int inputN;

    public Fibonacci(int inputN) {
        this.inputN = inputN;
    }

    public void FibonacciMaker (){
        ArrayList<Integer> fibonacciList = new ArrayList<Integer>();
        int index = 0;
        while (index < this.inputN){
            if (index == 0){
                fibonacciList.add(0);
                index++;
            }
            if (index == 1){
                fibonacciList.add(1);
                index++;
            }
            else{
                fibonacciList.add(fibonacciList.get(index-1)+fibonacciList.get(index-2));
                index++;
            }
        }
        System.out.println(fibonacciList.toString());

    }
}
