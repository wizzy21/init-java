package com.exo1;

import java.util.InputMismatchException;
import java.util.Scanner;

/*
Ecrire une programme qui multiple deux nombres qu'ilprend en entré
 */

public class ExoMultipleNumbers {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int nbOne;
        int nbTwo;
        int nbThree;

        try {
            System.out.print("Enter your first number: ");
            nbOne = scanner.nextInt();

            System.out.print("Enter your second number : ");
            nbTwo = scanner.nextInt();
            scanner.close();

            nbThree = nbOne * nbTwo;
            String resultToFormat = "Résultat : %d * %d = %d";
            String result = String.format(resultToFormat, nbOne, nbTwo, nbThree);

            System.out.println(result);
        } catch (InputMismatchException e) {
            System.out.println("Attention ! you are supposed to put in a whole number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}

