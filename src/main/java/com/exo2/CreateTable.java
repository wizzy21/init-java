package com.exo2;


// Ecrire un programme qui prend un nombre en etré et s'affiche sa table de 10

import java.util.InputMismatchException;
import java.util.Scanner;

public class CreateTable {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        Integer number = null;
        String operation = "+";

        while (number == null) {
            try {
                System.out.print("Enter a number : ");
                number = scanner.nextInt(); // Exception potentielly high, so the variable will stay  null
<<<<<<< Updated upstream
                scanner.close();
=======
                String op = scanner.nextLine();
>>>>>>> Stashed changes
            } catch (InputMismatchException e) {
                System.out.println("Attention ! You have to enter a number");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Oops an error has occured :");
                return;
            }
        }

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", number, i, number * i));
        }
}

}

/*
       Scanner scanner = new Scanner(System.in);
        Integer number = null;

        while (number == null) {
            try {
                System.out.print("Entrez un nombre : ");
                number = scanner.nextInt(); // Exception potentiellement levée, donc la variable number reste à null
            } catch (InputMismatchException e) {
                System.out.println("Attention ! Vous devez entrez un nombre");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Mince une erreur s'est produite :(");
                return;
            }
        }

        scanner.close();

        for (int i = 1; i <= 10; i++) {
            System.out.println(String.format("%d x %d = %d", number, i, number * i));
        }
 */