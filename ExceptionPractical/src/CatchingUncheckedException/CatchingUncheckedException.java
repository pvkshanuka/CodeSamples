package CatchingUncheckedException;

import java.util.Scanner;

public class CatchingUncheckedException {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter some value to check is Integer.\n");

        String num = scanner.nextLine();

        if (isInt(num)) {

            System.out.println(num + " This is a Integer.");

        } else {
            System.out.println(num + " This is not a Integer.");
        }

    }

    private static boolean isInt(String num) {

        try {
            Integer.parseInt(num);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

}
