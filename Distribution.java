package com.company;

import java.util.ArrayList;

public class Distribution{
    ArrayList<String> list = new ArrayList<>();
    public void enterNumbers(String input) throws ExceptionNumbers{
        String[] numbers = {"1","2","3","4","5","6","7","8","9","10"};
        String[] roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        StringBuffer StringBuffer = new StringBuffer();
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != '+' && input.charAt(i) != '-' && input.charAt(i) != '*' && input.charAt(i) != '/') {
                StringBuffer.append(input.charAt(i));
            }
            if(input.charAt(i) == '+' || input.charAt(i) == '-' || input.charAt(i) == '*' || input.charAt(i) == '/') {
                String transferChar = Character.toString(input.charAt(i));
                list.add(StringBuffer.toString());
                list.add(transferChar);
                StringBuffer.setLength(0);
            }
        }
        list.add(StringBuffer.toString());
        try {
            for (int b = 0; b < 10; b++) {
                if (input.contains(numbers[b])) {
                    normalNumber();
                    break;
                }
                if (input.contains(roman[b])) {
                    arifmeticNumbers();
                    break;
                }
            }
        }catch (Exception e){
            throw new ExceptionNumbers("Please, correct your enter");
        }
    }
    public void normalNumber () throws ExceptionNumbers{
        ArrayList<String> inMethodList = new ArrayList<>();
        Number call = new Number();
        String[] numbers = {"1","2","3","4","5","6","7","8","9","10"};
        String[] symbols = {"+","-","*","/"};
        try {
            for (int i = 0; i < numbers.length; i++) {
                if (list.get(0).equals(numbers[i])) {
                    inMethodList.add(list.get(0));
                }
            }
            for (int s = 0; s < symbols.length; s++) {
                if(list.get(1).equals(symbols[s])){
                    inMethodList.add(list.get(1));
                }
            }
            for (int b = 0; b < numbers.length; b++) {
                if(list.get(2).equals(numbers[b])){
                    inMethodList.add(list.get(2));
                }
            }
            call.normalNumbers(inMethodList.get(0), inMethodList.get(1), inMethodList.get(2));
        }catch (Exception e){
            throw new ExceptionNumbers("Please, correct your enter");
        }
    }
    public void arifmeticNumbers() throws ExceptionNumbers{
        ArrayList<String> inMethodList = new ArrayList<>();
        Arifmetic call = new Arifmetic();
        String[] roman = {"I","II","III","IV","V","VI","VII","VIII","IX","X"};
        String[] symbols = {"+","-","*","/"};
        for (int s = 0; s < roman.length; s++) {
            if(list.get(0).equals(roman[s])){
                inMethodList.add(list.get(0));
            }
        }
        for (int d = 0; d < symbols.length; d++) {
            if(list.get(1).equals(symbols[d])){
                inMethodList.add(list.get(1));
            }
        }
        for (int w = 0; w < roman.length; w++) {
            if(list.get(2).equals(roman[w])){
                inMethodList.add(list.get(2));
            }
        }
        try {
            call.arifmetica(inMethodList.get(0), inMethodList.get(1), inMethodList.get(2));
        }catch (Exception e){
            throw new ExceptionNumbers("Please, correct your enter");
        }
    }
}
