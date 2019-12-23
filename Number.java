package com.company;

public class Number {
    public void normalNumbers(String firstInput, String operator, String secondInput){
        int one = Integer.parseInt(firstInput);
        int two = Integer.parseInt(secondInput);
        if(operator.contains("+")){
            System.out.println(one + two);
        }
        if(operator.contains("-")){
            System.err.println(one - two);
        }
        if(operator.contains("/")){
            System.out.println(one / two);
        }
        if(operator.contains("*")){
            System.out.println(one * two);
        }
    }
}
