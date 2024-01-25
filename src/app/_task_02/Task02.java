package app._task_02;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        double[] prices = new double[5];
        Scanner sc = new Scanner(System.in);

        try {

            for (int i = 0; i < prices.length; i++) {
                System.out.print("Enter the price for day " + (i + 1) + ": ");
                String input = sc.next().replace(",", ".");
                prices[i] = Double.parseDouble(input);
            }

            System.out.print("Enter the day to search: ");
            int indexToSearch = sc.nextInt();
            double searchedPrice = searchPrice(prices, indexToSearch);

            System.out.println("Price at day " + indexToSearch + ": " + searchedPrice);
            //некорректный ввод символов (что-то, что не является числом)
        } catch (InputMismatchException e) {
            System.out.println("Invalid input. Please enter a valid number.");
            //некорректные условия ввода (не соответствует диапазону от 1 до 5)
        } catch (IllegalArgumentException e) {
            System.out.println("Invalid index. Please enter a valid day (1-5).");
        } finally {
            sc.close();
        }
    }

    private static double searchPrice(double[] prices, int index) {
        if (index < 1 || index > prices.length) {
            throw new IllegalArgumentException();
        }
        return prices[index - 1];
    }
}