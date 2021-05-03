/**
 * THIS IS THE EXTENSION FILE FOR THE SimpleCalculator
 * FILE. THIS CONTAINS ALL THE METHODS CALLED IN MAIN
 * 
 * @author Connor Damron
 * @since 2021-05-02
 */

import java.util.Scanner;

public class Computations {

    public double FirstNumber(Scanner input) {
        System.out.println();

        System.out.print("Enter your first number: ");
        double numberOne = input.nextDouble();

        //System.out.println(numOne); //Used to Debug

        return numberOne;
    }

    public double SecondNumber(Scanner input) {
        System.out.print("Enter your second number: ");
        double numberTwo = input.nextDouble();

        //System.out.println(numTwo); //Used to Debug

        return numberTwo;
    }

    public char UserAction(Scanner input) {

        System.out.println();

        System.out.println("What would you like to do?");

        System.out.println("A-Addition");
        System.out.println("S-Subtraction");
        System.out.println("M-Multiplication");
        System.out.println("D-Division");
        System.out.println("Q-Quit");

        System.out.println();
        String blank = input.nextLine();

        System.out.print("Your option: ");
        String userStr = input.nextLine();
        
        //System.out.println(userStr); //Used to debug

        char userOption = userStr.charAt(0);

        char userChar = Character.toUpperCase(userOption);
        //System.out.println(userChar); //Used to debug

        return userChar;
    }

    public void Addition(double firstNum, double secondNum) {
        System.out.println(firstNum + " + " + secondNum);

        double answer = firstNum + secondNum;
        System.out.println("= " + answer);

    }

    public void Subtraction(double firstNum, double secondNum) {
        System.out.println(firstNum + " - " + secondNum);

        double answer = firstNum - secondNum;
        System.out.println("= " + answer);

    }

    public void Multiplication(double firstNum, double secondNum) {
        System.out.println(firstNum + " * " + secondNum);

        double answer = firstNum * secondNum;
        System.out.println("= " + answer);

    }

    public void Division(double firstNum, double secondNum) {
        System.out.println(firstNum + " / " + secondNum);

        double answer = firstNum / secondNum;
        System.out.println("= " + answer);

    }
}
