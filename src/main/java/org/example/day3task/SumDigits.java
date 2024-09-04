package org.example.day3task;

public class SumDigits {

//    int digits;

    String digitsString;

    public SumDigits(String digitsString) {
//        this.digits = digits;
        this.digitsString = digitsString;

    }

    public void sumDigits(){
        int sum = 0 ;

        for(int i = 0 ; i<this.digitsString.length(); i++){
            sum += (this.digitsString.charAt(i) - '0');
            System.out.println("loop: "+i+ " int sum value: " + sum);
        }


    }
}
