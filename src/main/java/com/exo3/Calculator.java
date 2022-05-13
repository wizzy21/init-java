package com.exo3;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class Calculator {

    private final List<String> handledOperators = new ArrayList<String>() {{
        add("+");
        add("-");
        add("*");
        add("/");
    }};

    public void start() throws Exception {

        Long result = retrieveRequestedOperation();

        if (result == null) {
            throw new Exception("Une erreur est survenue !");
        }

        System.out.println(String.format("Résultat : %d", result));
    }

   private Long retrieveRequestedOperation() {
        Scanner scanner = new Scanner(System.in);

       Long firstNumber = null;
      Long secondNumber = null;
        String operator = null;

        // On boucle tant que l'utilisateur ne rentre pas de valeur valide
        while (firstNumber == null || secondNumber == null || operator == null) { // Tant que firstNumber, secondNumber et operator sont vides on reste à l'interieur de la boucle
            try {
                System.out.print("Saisir le premier nombre : ");
                firstNumber = scanner.nextLong();

                System.out.print("Saisir le deuxieme nombre : ");
                secondNumber = scanner.nextLong();

                System.out.print("Saisir l'opérateur arithmetique (+, -, *, /) : ");
                operator = scanner.next();

                //// From here the operator is not null it has something in it
                /* We are looking to si if the operator entered by the user is in the list of operators that we know to handle
                We inverse with ! the return valeur of the method contain to enter in our error handling in case the operator is not in the list
                * */

                if (!handledOperators.contains(operator)) {
                    System.out.println(String.format("Votre opérateur [%s] n'est pas valide !\n", operator));
                    operator = null;  // We force the variable to be null to be able to co,tinue to iterate in our lopp
                }
            } catch (InputMismatchException ime) {
                System.out.println("Désolé votre entré n'est pas valide\n");
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Une erreur est survenue lorsqu'on récupère les entrés de l'utilisateur\n");
                return null;
            }
        }

        scanner.close();

        return calculate(firstNumber, secondNumber, operator);
    }

    protected Long calculate(Long firstNumber, Long secondNumber, String operator) {

        Long result;

        switch (operator) {

            case "+":
                result = add(firstNumber, secondNumber);
                break;

            case "-":
                result = subtract(firstNumber, secondNumber);
                break;

            case "*":
                result = multiply(firstNumber, secondNumber);
                break;

            case "/":
                result = divide(firstNumber, secondNumber);
                break;

            default:
                result = null;
                break;
        }

       /* System.out.println(String.format("Opération demandée : %d %s %d", firstNumber, operator, secondNumber));
        System.out.println(String.format("Résultat : %d", result));*/

        return result;

    }


    public long add(long a, long b) {
        return a + b;
    }

    public long subtract(long a, long b) {
        return a - b;
    }

    public long multiply(long a, long b) {
        return a * b;
    }

    public long divide(long a, long b) throws ArithmeticException {

        if (b == 0) {
            throw new ArithmeticException("Il est impossible d'effectuer une division par 0 !");
        }

        return a / b;
    }
}
    /*public long modulo(int num1, int num2)throws ArithmeticException{
        int myMoudlo;
      myMoudlo = num1 / num2;

        if (num2 == 0){
            throw new ArithmeticException("Not possible to divide by zero!");
        }
        return myMoudlo;
    }
*/







