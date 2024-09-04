package org.example.day3task;

public class VowelCheck {
    String vowelInput;

    public VowelCheck(String vowelInput) {
        this.vowelInput = vowelInput;
    }

    public void countVowel(){
        int cnt =0 ;
        for(int i =0 ; i < vowelInput.length();i++){
            char iChar = vowelInput.charAt(i);
            if (Character.toLowerCase(iChar) == 'a' ||
                    Character.toLowerCase(iChar) == 'i' ||
                    Character.toLowerCase(iChar) == 'u'||
                    Character.toLowerCase(iChar) == 'e'||
                    Character.toLowerCase(iChar) == 'o'){

                cnt += 1;
            }
        }
        System.out.println("The number of the vowels in string is: " + cnt);
    }
}
