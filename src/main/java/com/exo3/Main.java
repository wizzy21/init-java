package com.exo3;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Integer num1 = null;
        Integer num2 = null;
        String operation = "+";
        int result;

        Scanner scan = new Scanner(System.in);
        while ((num1 = null || num2 == null)) {
            try {

                //Addition
                System.out.println("PLease enter a number");
                number = scan.nextInt();
                operation = scan.nextLine();
            } catch (InputMismatchException imp) {
                System.out.println("Attention, you need to put in a number only  ");
            }
            System.out.println("Please enter another number");
            number = scan.nextInt();
        }  catch(ImputMismatchException imp){
            System.out.println("Oops an error has occured :");
        }
    }
   / System.out.println("Choisissez l'opération, appuyez sur : \n 1 + l'addition \n 2 + for substraction\n 3 for multiplicatiion \n 4 pour la division");
    choice = scanner.nextInt();


  if (choice == 1) {
        calculator.addition(arg1,arg2);
    }
        else {
        System.out.println("Recommencez ! ");
    }



switch(operation){
    case"+":
        result = Calculator.add(3,4);
        System.out.println(String.format("result: %d * %d = %d", num1,num2, result);

       //System.out.println("Result : %d + %d =%d ,
       // System.out.println(num1 + " + " + num2 + " = " + result);

        break;
        case "-":
        System.out.println(Calculator.subtract());
        break;
        case "*":
        System.out.println(Calculator.multiplication());
        break;
        case "/":
        System.out.println(Calculator.division());
        break;
        default:
            System.out.println("Did not enter an operator (+,-,*,/");


        }
  scan.close();
        }

