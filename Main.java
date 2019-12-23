package com.company;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) throws ExceptionNumbers {
        System.out.println("Hello. \nI hope that my code will pass check so please, enter your numbers for example: X+V and then you will get the answer.\nHave a nice day :)");
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        Distribution distribution = new Distribution();
        distribution.enterNumbers(input);
    }
}

