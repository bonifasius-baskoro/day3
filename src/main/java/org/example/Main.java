package org.example;

import org.example.day3task.PrimeChecker;
import org.example.day3task.SumDigits;

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
    }
}