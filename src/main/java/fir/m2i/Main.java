package fir.m2i;

public class Main {
    public static void main(String[] args) {

         /*
        int x = 10;
        int y = 2;

        System.out.println(x);
        System.out.println(y);

        x += 10; // equivalent à x = x + 10
        y -= 1; // equivalent à y = y - 1

        System.out.println(x);
        System.out.println(y);

        x /= y; // equivalent à x = x / y
        y *= x; // equivalent à y = y * x

        System.out.println(x);
        System.out.println(y);

        x -= 2; // x = 18
        y %= x; // equivalent à y = y % x; division euclidienne -> 20 / 18 = 1 on assigne le reste dans y -> 2

        System.out.println(x);
        System.out.println(y); */


//Practicing  Arethetic Operators printing them out
/*
        int x = 10;
        int y = 2;

        System.out.println(x + y);
        System.out.println(x - y);
        System.out.println(x * y);
        System.out.println(x / y);
        System.out.println(x % y);

    }*/
/*
        // Conditional Operators

        int a = 7;
        int b = 11;

        // == operator
        System.out.println(a == b);  // false

        // != operator
        System.out.println(a != b);  // true

        // > operator
        System.out.println(a > b);  // false

        // < operator
        System.out.println(a < b);  // true

        // >= operator
        System.out.println(a >= b);  // false

        // <= operator
        System.out.println(a <= b);  // true
    }

 */
        /*
        // && operator
        System.out.println((5 > 3) && (8 > 5));  // true
        System.out.println((5 > 3) && (8 < 5));  // false

        // || operator
        System.out.println((5 < 3) || (8 > 5));  // true
        System.out.println((5 > 3) || (8 < 5));  // true
        System.out.println((5 < 3) || (8 < 5));  // false

        // ! operator
        System.out.println(!(5 == 3));  // true
        System.out.println(!(5 > 3));  // false
        */
        /*

        int x = 10;

        System.out.println(x++);
        // A partir de maintenant x = 11;

        System.out.println(++x); // l'addition est faite en priorité -> x = 12

        System.out.println(x--);
        // A partir de maintenant x = 11;

        System.out.println(--x); // la soustraction est faite en priorité -> x = 10
         //Unary Operators
*/
/*
        int februaryDays = 29;
        String result;

        // ternary operator
        result = (februaryDays == 28) ? "Not a leap year" : "Leap year";
        System.out.println(result);

        // équivalent à
        if (februaryDays == 28) {
            result = "Not a leap year";
        } else {
            result = "Leap year";
        }

        System.out.println(result);
        }
        */

/*
        // IF /ELSE STATEMENTS
        int legalAge = 18;
        int myAge= 20;

        if (myAge >=legalAge)// cAN WRITE if( 20>=legalAge) {
        {
            System.out.println("Tu es majeur");
        } else {
            System.out.println("Fin du programme");
        }
/*
USING THE TENARY OPERATOR TO SHORTEN THE CODE ABOVE IF/ELSE-- IT GIVES THE SAME RESULTS

Can put in a variable so dont have to use system.out.println and shotren le code in the printout
String result = (myAge >=legalAge) ? "Tu es Majeur" : "Fin du programme");
or
use the system.out.println to do the same thing
 System.out.println( (myAge >=legalAge) ? "Tu es Majeur" : "Fin du programme"));
 */

        /*
        int legalAge = 18;
        int myAge = 22;

        if (myAge >=legalAge  ) {
            System.out.println("Tu es majeur");
        } else {
            System.out.println("Profite de ta jeunesse gamin");
        }

        System.out.println("Fin du programme");

        String result = (myAge >=legalAge )? "Tu es majeur" : "Profite de ta jeunesse gamin";
        System.out.println(result);
        System.out.println("Fin du programme");
*/

        /*
        int legalAge = 18;
        int internationalLegalAge = 21;
        int myAge = 22;

        // Because in this case the person is of legal age and its true he is of internaional age do nested ifs
        if (myAge >= legalAge && myAge <internationalLegalAge ) {
            System.out.println("Tu es majeur");
        } else if (myAge >= internationalLegalAge) {
            System.out.println("Tu es désormais un adulte dans le monde entier !");
        }

        System.out.println("Fin du programme");
        */


        /*
        more on if/else but with if , else if , else

        String direction = "up";

        if (direction == "up") {
            System.out.println("On déplace le personnage vers l'avant");
        } else if (direction == "left") {
            System.out.println("On déplace le personnage vers la gauche");
        } else if (direction == "right") {
            System.out.println("On déplace le personnage vers la droite");
        } else if (direction == "down") {
            System.out.println("On déplace le personnage vers la bas");
        } else {
            System.out.println("Veuillez utiliser les flèches directionnel pour vous déplacer");
        }

        System.out.println("Fin du programme");
        */


        // The code above is better in a switch so can do so as seen below
        String direction = "up";

        switch (direction) {
            case "up":
                System.out.println("On déplace le personnage vers l'avant");
                break;
            case "left":
                System.out.println("On déplace le personnage vers la gauche");
                break;
            case "right":
                System.out.println("On déplace le personnage vers la droite");
                break;
            case "down":
                System.out.println("On déplace le personnage vers la bas");
                break;
            default:
                System.out.println("Veuillez utiliser les flèches directionnel pour vous déplacer");
                break;
        }

        System.out.println("Fin du programme");

//LOOPS

        // While loop

        int i = 0;

        while (i < 10) {
            System.out.println(i);
            i++;
        }
/*
            if (i == 1) {
               break;
                //return; will stop the code here and return what was ask
                // break;  COME OUT OF THE LOOP  will continue the code
            }
        }
            System.out.println("Je continue ma method");
        }

}
*/
        /*

        // do while
        int i = 0;

        do {
            System.out.println(i);
            i++;
        } while (i <=10);
*/
        // FOR LOOPS

        for (int index = 0; index <=10; index++) {
            System.out.println(index);
        }
//CAN USE RETURN AND BREAK HERE TO

        // THE FOREACH -- USED A LOT ON ARRAY TABLES OR LISTS MAINLY

        int[] numbers = {0, 1, 2, 3, 4, 5};
/*
        for (int i =0; i < numbers.length ; i++){
            System.out.println(numbers[i]);
        }*/
// to do in foreach
        for (int number : numbers) {// The int number -is
            System.out.println(number);
        }



/*
        //MAPS
        Map<Integer> map=new HashMap<Integer,Integer>();
        map.put(0,0);
        for (Integer key:map.values());
*/



    }
}