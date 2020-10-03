package com.company;

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //TODO 1: Surround the following four lines of code with try block
        try{
            int a = scan.nextInt();
            int b = scan.nextInt();
            int c = a / b;
            System.out.println(a + "/" + b + " = " + c);
        }
        catch (ArithmeticException e){
            System.out.println("You should not divide by zero.");
        }
        catch(InputMismatchException e){
            System.out.println("Both a and b should be integers.");
        }
        //TODO 2: Put catch blocks to handle both the scenarios and print suitable messages
    }

    static Scanner scan = null;

    private static void setScanner() {
        try {
            scan = new Scanner(new InputStreamReader(System.in));
//            scan = new Scanner(new FileReader("/code/workspace/sample_input.txt"));
        } catch (Exception e) {
            scan = null;
        }
    }

    static {
        setScanner();
    }
}
