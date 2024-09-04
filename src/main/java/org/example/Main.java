package org.example;

import org.example.day3task.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Hello world!");

        Scanner inputUser = new Scanner(System.in);

//       Day 3 - Task 1
        System.out.println("Enter digits to sum : ");

        String digitInput = inputUser.nextLine();
        SumDigits test1 = new SumDigits(digitInput);

        test1.sumDigits();

//        Day 3 - Task 2
        System.out.println("Enter number to check is it prime or not : " );
        String primeInput = inputUser.nextLine();

        PrimeChecker test2 = new PrimeChecker();

        test2.checkPrime(Integer.parseInt(primeInput));
        // DAY 3 - Task 3

        System.out.println("Enter Number multiple time & press 'c' to calculate");
        List<Integer> numbers= new ArrayList<Integer>();
        while (inputUser.hasNextInt() ){
            numbers.add(inputUser.nextInt());
            System.out.println("The array:"+ numbers.toString());
        }


        LargestElement test3 = new LargestElement(numbers);
        test3.findLargest();


        // Day 3 - task 4

        String calcInput = "5+2";

        SimpleCalc test4= new SimpleCalc(calcInput);
        test4.calculateInput();

        //Day 3 - task 5
        String reverseInput = "ayam";


        ReverseString test5 = new ReverseString(reverseInput);

        test5.reverseString();

        //Day3 - task 6

        int input6 = 8;

        Fibonacci test6 = new Fibonacci(input6);

        test6.FibonacciMaker();

        //Day3 - task 7

        String vowelInput = "aiueowwww";

        VowelCheck test7 = new VowelCheck(vowelInput);

        test7.countVowel();

        //Day3 - task 8

    }
}