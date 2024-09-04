package org.example.day3task;

import java.util.HashMap;
import java.util.concurrent.atomic.AtomicBoolean;

public class Anagram {
    String inputString1;
    String inputString2;
    HashMap<String,Integer> hashString1 = new HashMap<String, Integer>();
    HashMap<String,Integer> hashString2 = new HashMap<String, Integer>();

    public Anagram(String inputString1, String inputString2) {
        this.inputString1 = inputString1;
        this.inputString2 = inputString2;
        for(int i = 0 ; i<inputString1.length();i++){
            String charAtString1 = Character.toString(this.inputString1.charAt(i));
            String charAtString2 = Character.toString(this.inputString2.charAt(i));
//            System.out.println(charAtString1 + " " + charAtString2);
            if(!this.hashString1.containsKey(charAtString1)){
                this.hashString1.put(charAtString1, 0);
            }
            else {
                this.hashString1.put(charAtString1,this.hashString1.get(charAtString1) + 1 );
            }

            if(!this.hashString2.containsKey(charAtString2)){
                this.hashString2.put(charAtString2, 0);
            }
            else {
                this.hashString2.put(charAtString2,this.hashString2.get(charAtString2) + 1 );
            }
//            System.out.println(i + " loop " +  !this.hashString1.containsKey(charAtString1) +"1" +  !this.hashString2.containsKey(charAtString2) + "2" );

        }
//        System.out.println(this.hashString1.toString() + this.hashString2.toString());
    }

    public void checkAnagram(){
        AtomicBoolean ans = new AtomicBoolean(false);
        this.hashString1.forEach((key,value)->{
            if(this.hashString1.get(key).equals(this.hashString2.get(key))){
                ans.set(true);
            }
            else{
                ans.set(false);
            }

        });
        System.out.println("Is this anagram : "+ ans);
    }
}
