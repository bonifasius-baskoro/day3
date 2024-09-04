package org.example.day3task;

public class ReverseString {

    String inputString;

    public ReverseString(String inputString) {
        this.inputString = inputString;
    }

    public void reverseString(){
        StringBuilder reversedString = new StringBuilder() ;
        for (int i = this.inputString.length()-1 ; i >= 0 ; i--){
            reversedString.append(this.inputString.charAt(i));
        }
        System.out.println("Reversed String: " + reversedString);

    }
}
