/*
 * Group Members:
 * Alvarez, Maria Alexandra
 * Balogo, Renuel Jeremi
 * Cagulada, Sheryn Ann
 * Lumanglas, Yenzy Hynna
 * Palacay, Abigail
 *
 * Class Code and Schedule: 9315 CS122 MTh 9:00 - 10:30
 */
package prog2.prelimgroup;

import java.util.Scanner;

public class FractionArithmetic {

    /*
     * main method
     */
    public static void main(String[] args) {
        FractionArithmetic myProgram = new FractionArithmetic();
        myProgram.run();
    }
    static Scanner keyboard = new Scanner(System.in);

    /*
     * run method
     */
    public void run() {
        int choice;
        boolean repeat = true;
        Fraction fraction1 = new Fraction();
        Fraction fraction2 = new Fraction();

        while (repeat) {
            System.out.println("This program will allow you to perform arithmetic operations using fractions");
            System.out.println();
            System.out.println("Please choose your operation of your choosing");
            showMenu();
            choice = readChoice();

            switch (choice) {
                case 1:
                    System.out.println("You've chose to add fractions");
                    System.out.println("Please provide the necessary details for fraction no. 1");
                    fraction1 = fraction1.readAFraction();
                    System.out.println("The entered fraction is " + fraction1);
                    pressEnter();

                    System.out.println("Please provide the necessary details for fraction no. 2");
                    fraction2 = fraction2.readAFraction();
                    System.out.println("The entered fraction is " + fraction2);
                    pressEnter();

                    Fraction sFraction = new Fraction();
                    sFraction = sFraction.addFraction(fraction1, fraction2);

                    System.out.println("Result is equal to " + sFraction + " or " + sFraction.toDouble());
                    pressEnter();
                    break;
                case 2:
                    System.out.println("You've chose to subtract the fractions");
                    System.out.println("Please provide the necessary details for fraction no. 1");
                    fraction1 = fraction1.readAFraction();
                    System.out.println("The entered fraction is " + fraction1);
                    pressEnter();

                    System.out.println("Please provide the necessary details for fraction no. 2");
                    fraction2 = fraction2.readAFraction();
                    System.out.println("The entered fraction is " + fraction2);
                    pressEnter();

                    Fraction subFraction = new Fraction();
                    subFraction = subFraction.subtractFraction(fraction1, fraction2);

                    System.out.println("Result is equal to " + subFraction + " or " + subFraction.toDouble());
                    pressEnter();
                    break;
                case 3:
                    System.out.println("You've chose to multiply fractions");
                    System.out.println("Please provide the necessary details for fraction no. 1");
                    fraction1 = fraction1.readAFraction();
                    System.out.println("The entered fraction is " + fraction1);
                    pressEnter();

                    System.out.println("Please provide the necessary details for fraction no. 2");
                    fraction2 = fraction2.readAFraction();
                    System.out.println("The entered fraction is " + fraction2);
                    pressEnter();

                    Fraction multiFraction = new Fraction();
                    multiFraction = multiFraction.multiplyFraction(fraction1, fraction2);

                    System.out.println("Result is equal to " + multiFraction + " or " + multiFraction.toDouble());
                    pressEnter();
                    break;
                case 4:
                    System.out.println("You've chose to divide a fraction");
                    System.out.println("Please provide the necessary details for fraction no. 1");
                    fraction1 = fraction1.readAFraction();
                    System.out.println("The entered fraction is " + fraction1);
                    pressEnter();

                    System.out.println("Please provide the necessary details for fraction no. 2");
                    fraction2 = fraction2.readAFraction();
                    System.out.println("The entered fraction is " + fraction2);
                    pressEnter();

                    Fraction divFraction = new Fraction();
                    divFraction = divFraction.divideFraction(fraction1, fraction2);

                    System.out.println("Result is equal to " + divFraction + " or " + divFraction.toDouble());
                    pressEnter();
                    break;
                case 5:
                    System.out.println("You've chose to reduce a fraction");
                    System.out.println("Please provide the necessary details");

                    fraction1 = fraction1.readAFraction();
                    System.out.println("The entered fraction is " + fraction1);
                    pressEnter();

                    Fraction redFraction = new Fraction();
                    redFraction = redFraction.reduceFraction(fraction1);
                    System.out.println();
                    System.out.println("The result is equal to " + redFraction + " or " + redFraction.toDouble());
                    pressEnter();
                    break;
                case 6:
                    repeat = false;
                    System.out.println("Thank you for using the program!");
                    System.exit(0);
                    break;
            }
        }
    }

    /*
     * showMenu method to display menu
     */
    public void showMenu(){
        System.out.println("M E N U");
        System.out.println("1. Addition of Fractions");
        System.out.println("2. Subtraction of Fractions");
        System.out.println("3. Multiplication of Fractions");
        System.out.println("4. Division of Fractions");
        System.out.println("5. Reduce a fraction");
        System.out.println("6. Quit");
    }

    /*
     * pressEnter method to allow user to press enter and move on
     */
    public void pressEnter(){
        System.out.print("Press enter to continue...");
        keyboard.nextLine();
    }

    /*
     * readChoice method to validate user input
     */
    public int readChoice(){
        int choice = 7;
        boolean validNumberRead = false;

        while (!validNumberRead) {
            try {
                while (choice >= 7) {
                    System.out.print("Enter your choice: ");
                    choice = Integer.parseInt(keyboard.nextLine());
                    if (choice >= 7)
                        System.out.println("Your choice should only be from 1-6");
                }
                validNumberRead = true;
            } catch (NumberFormatException exception){
                    System.out.println("Make sure that you have entered a number.");
                }
        }
        return choice;
    }
}
