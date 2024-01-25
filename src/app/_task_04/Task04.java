package app._task_04;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task04 {
    private static final double LOW_WORK_TEMPERATUR = -10;
    private static final double HIGH_WORK_TEMPERATUR = 35;

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("Enter actual Temperatur: ");
            double actualTemperatur = sc.nextDouble();

            work(actualTemperatur);

            System.out.println("It can Work");
        } catch (TemperaturWorkException e) {
            System.out.println("Temperatur error: " + e.getMessage());
        } catch (InputMismatchException e) {
            System.out.println("Bad format");
        } finally {
            sc.close();
        }
    }

    private static void work(double actualTemperatur) throws TemperaturWorkException {
        if (actualTemperatur < LOW_WORK_TEMPERATUR || actualTemperatur > HIGH_WORK_TEMPERATUR) {
            throw new TemperaturWorkException("is not within the temperature range");
        }
    }

    public static class TemperaturWorkException extends Exception {
        public TemperaturWorkException(String message) {
            super(message);
        }
    }
}