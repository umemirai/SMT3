package ExceptionHandling;

import java.util.InputMismatchException;
import java.util.Scanner;

public class ExceptionHandler {
   
    public int getValidInput(Scanner scanner) throws NegativeNumberException {
        int number = scanner.nextInt();
        if (number < 0) {
            throw new NegativeNumberException("Bilangan negatif tidak diperbolehkan.");
        }
        return number;
    }

    // Method untuk membagi dua bilangan
    public int divideNumbers(int num1, int num2) {
        return num1 / num2; // Bisa melempar ArithmeticException jika num2 == 0
    }
}

