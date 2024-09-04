package org.example.day3task;

public class SimpleCalc {
    String inputCalc;

    public SimpleCalc(String inputCalc) {
        this.inputCalc = inputCalc;
    }

    public void calculateInput (){
        if(this.inputCalc.contains("+")){
            int indexOperator = this.inputCalc.indexOf("+");
            int number1=  Integer.parseInt(this.inputCalc.substring(0,indexOperator)) ;
            int number2=  Integer.parseInt(this.inputCalc.substring(indexOperator+1));
            System.out.println("Result of the calculator : "+(number1+number2));

        } else if (this.inputCalc.contains("-")) {
            int indexOperator = this.inputCalc.indexOf("-");
            int number1=  Integer.parseInt(this.inputCalc.substring(0,indexOperator)) ;
            int number2=  Integer.parseInt(this.inputCalc.substring(indexOperator+1));
            System.out.println("Result of the calculator : "+ (number1-number2));
        } else if (this.inputCalc.contains("/")) {
            int indexOperator = this.inputCalc.indexOf("/");
            int number1=  Integer.parseInt(this.inputCalc.substring(0,indexOperator)) ;
            int number2=  Integer.parseInt(this.inputCalc.substring(indexOperator+1));
            System.out.println("Result of the calculator : "+ (number1/number2));
        } else if (this.inputCalc.contains("*")) {
            int indexOperator = this.inputCalc.indexOf("*");
            int number1=  Integer.parseInt(this.inputCalc.substring(0,indexOperator)) ;
            int number2=  Integer.parseInt(this.inputCalc.substring(indexOperator+1));
            System.out.println("Result of the calculator : "+ (number1*number2));
        }
    }
}
