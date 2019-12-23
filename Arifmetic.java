package com.company;

public class Arifmetic {
    public void arifmetica(String firstInput, String operator, String secondInput) {
        if (firstInput.equals("I")) {
            firstInput = "1";
        }
        if (secondInput.equals("I")) {
            secondInput = "1";
        }
        if (firstInput.equals("II")) {
            firstInput = "2";
        }
        if (secondInput.equals("II")) {
            secondInput = "2";
        }
        if (firstInput.equals("III")) {
            firstInput = "3";
        }
        if (secondInput.equals("III")) {
            secondInput = "3";
        }
        if (firstInput.equals("IV")) {
            firstInput = "4";
        }
        if (secondInput.equals("IV")) {
            secondInput = "4";
        }
        if (firstInput.equals("V")) {
            firstInput = "5";
        }
        if (secondInput.equals("V")) {
            secondInput = "5";
        }
        if (firstInput.equals("VI")) {
            firstInput = "6";
        }
        if (secondInput.equals("VI")) {
            secondInput = "6";
        }
        if (firstInput.equals("VII")) {
            firstInput = "7";
        }
        if (secondInput.equals("VII")) {
            secondInput = "7";
        }
        if (firstInput.equals("VIII")) {
            firstInput = "8";
        }
        if (secondInput.equals("VIII")) {
            secondInput = "8";
        }
        if (firstInput.equals("XI")) {
            firstInput = "9";
        }
        if (secondInput.equals("XI")) {
            secondInput = "9";
        }
        if (firstInput.equals("X")) {
            firstInput = "10";
        }
        if (secondInput.equals("X")) {
            secondInput = "10";
        }
        int transferFirst = Integer.parseInt(firstInput);
        int transferSecond = Integer.parseInt(secondInput);
        int[] arabic = {500, 100, 50, 40, 10, 9, 5, 4, 1};
        String[] roman = {"D", "C", "L", "XL", "X", "IX", "V", "IV", "I"};
        StringBuilder romanNumerals = new StringBuilder();
        int relust = 0;
        if (operator.contains("+")) {
            relust = transferFirst + transferSecond;
        }
        if (operator.contains("-")) {
            relust = transferFirst - transferSecond;
        }
        if (operator.contains("/")) {
            relust = transferFirst / transferSecond;
        }
        if (operator.contains("*")) {
            relust = transferFirst * transferSecond;
        }
        for (int i = 0; i < arabic.length; i++) {
            while (relust >= arabic[i]) {
                romanNumerals.append(roman[i]);
                relust -= arabic[i];
            }
        }
        System.err.println(romanNumerals.toString());
    }
}
