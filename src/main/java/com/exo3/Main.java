package com.exo3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Calculator myCalculator = new Calculator();


        try {
            myCalculator.start();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}