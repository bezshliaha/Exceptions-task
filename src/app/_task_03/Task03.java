package app._task_03;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task03 {
    private static final String CURRENCY = "EUR";

    public static void main(String[] args) throws NumberFormatException {
        double cardBalance = 67.76;
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter the payment amount in " + CURRENCY + ": ");
            String input = sc.next().replace(",", ".");
            double paymentAmount = Double.parseDouble(input);


            validatePayment(cardBalance, paymentAmount);

            System.out.println("Payment successful.");
        } catch (IllegalArgumentException e) {
            System.out.println("Payment error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Bad format");
        } finally {
            sc.close();
        }
    }

    private static void validatePayment(double cardBalance, double paymentAmount) {
        if (paymentAmount > cardBalance) {
            throw new IllegalArgumentException("Insufficient funds on the card for payment.");
        }
    }
}