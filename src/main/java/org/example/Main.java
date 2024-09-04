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

        //Can't use user input after the line above
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

        ArrayList<Integer> arrayTest8 = new ArrayList<Integer>();
        arrayTest8.add(3);
        arrayTest8.add(12);
        arrayTest8.add(5);
        arrayTest8.add(7);
//        System.out.println( arrayTest8);

        BubbleSort test8 = new BubbleSort(arrayTest8);
        test8.sortArray();

        //Day3 - task 9
        String inputString1="ayam";
        String inputString2= "maya";

        Anagram test9 = new Anagram(inputString1,inputString2);
        test9.checkAnagram();

        //Day3 - task10

        ArrayList<Integer> arrayTest10 = new ArrayList<Integer>();
        arrayTest10.add(3);
        arrayTest10.add(12);
        arrayTest10.add(5);
        arrayTest10.add(7);

        BubbleSort test10 = new BubbleSort(arrayTest10);
        System.out.println("The second biggest element : " + test10.sortArray().get(arrayTest10.size()-2));




    }
}