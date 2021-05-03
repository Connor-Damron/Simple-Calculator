/**
 * THIS IS A SIMPLE CALCULATOR DESIGNED TO PROMPT FOR TWO 
 * NUMBERS FROM THE USER THEN ASK WHAT THEY WOULD LIKE TO
 * WITH THEM.
 * 
 * @author Connor Damron
 * @version 1.0
 * @since 2021-05-02
 */

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        
        Computations equations = new Computations();
        Scanner scn = new Scanner(System.in);

        System.out.println("Welcome! Follow the prompt to calculate two numbers.");

        double numOne = equations.FirstNumber(scn);
        double numTwo = equations.SecondNumber(scn);
        char userChoice = equations.UserAction(scn);

        while(userChoice != 'Q') {
            
            if (userChoice == 'A') {
                equations.Addition(numOne, numTwo);
            }
            else if (userChoice == 'S') {
                equations.Subtraction(numOne, numTwo);
            }
            else if (userChoice == 'M') {
                equations.Multiplication(numOne, numTwo);
            }
            else if (userChoice == 'D') {
                equations.Division(numOne, numTwo);
            }
            else {
                break;
            }

            System.out.print("Would to like to perform another calculation? (y/n): ");
            String anotherCalc = scn.nextLine();

            if (anotherCalc.charAt(0) == 'y') {
                numOne = equations.FirstNumber(scn);
                numTwo = equations.SecondNumber(scn);
                userChoice = equations.UserAction(scn);
            }
            else {
                break;
            }

        }
        System.out.println("Goodbye!");



    }
}

