package bullscows;


import java.util.InputMismatchException;

public class Main {
    static java.util.Scanner scanner = new java.util.Scanner(System.in);
    static int number;
    static int possibleNumber;
    static String secretCode;

    public static void main(String[] args) {
        try {
            System.out.println("Please, enter the secret code's length:");
            number = scanner.nextInt();
            if (number > 36 || number <= 0) {
                System.out.println("Error: it isn't a valid length.");
            } else {
                System.out.println("Input the number of possible symbols in the code:");
                possibleNumber = scanner.nextInt();
                secretCode = Number.nanoTime();
                System.out.print("The secret is prepared: ");
                for (int i = 0; i < number; i++) {
                    System.out.print("*");
                }


                if (possibleNumber <= 10) {
                    System.out.println(" (0-" + (possibleNumber - 1) + ")");
                } else if (possibleNumber == 11) {
                    System.out.println(" (0-9, a)");
                } else {
                    String code = "0123456789abcdefghijklmnopqrstuvwxyz";
                    System.out.printf("(0-9, a-%c)%n", code.charAt(possibleNumber - 1));
                }


                System.out.println("Okay, let's start a game!");

                GameProcess.game();
            }




        } catch (IndexOutOfBoundsException e) {
            System.out.println("Error: maximum number of possible symbols in the code is 36 (0-9, a-z).");
        } catch (IllegalArgumentException e) {
            System.out.printf("Error it's not possible to generate a code with a length of %d with %d unique symbols.", number, possibleNumber);
        } catch (InputMismatchException e) {
            System.out.println("Error: it isn't a valid number.");
        }
    }
}



