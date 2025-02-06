
package ExceptionHandling;
  import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ExceptionHandler handler = new ExceptionHandler(); // Instance dari class ExceptionHandler
        boolean success = false;

        while (!success) {
            try {
                // Input dua bilangan dari pengguna
                System.out.print("Masukkan bilangan pertama: ");
                int num1 = handler.getValidInput(scanner);

                System.out.print("Masukkan bilangan kedua: ");
                int num2 = handler.getValidInput(scanner);

                // Membagi bilangan pertama dengan bilangan kedua
                int result = handler.divideNumbers(num1, num2);
                System.out.println("Hasil pembagian: " + result);

                success = true; // Jika berhasil, keluar dari loop
            } catch (NegativeNumberException e) {
                System.out.println("Error: " + e.getMessage());
            } catch (ArithmeticException e) {
                System.out.println("Error: Tidak bisa membagi dengan nol. Silakan coba lagi.");
            } catch (InputMismatchException e) {
                System.out.println("Error: Input harus berupa angka. Silakan coba lagi.");
                scanner.nextLine(); // Membersihkan buffer input
            } catch (Exception e) {
                System.out.println("Terjadi error yang tidak diketahui: " + e.getMessage());
            } finally {
                System.out.println("Program mencoba menjalankan operasi.");
            }
        }
        System.out.println("Program selesai.");
    }
}

