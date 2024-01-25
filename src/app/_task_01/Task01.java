package app._task_01;

import java.util.Scanner;

public class Task01 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter an integer: ");
            String userInput = sc.nextLine();
            int number = Integer.parseInt(userInput);

            System.out.println("You entered the number: " + number);
        } catch (NumberFormatException e) {
            System.err.println("Number format error: " + e.getMessage());
        } finally {

            sc.close();
        }
    }
}

