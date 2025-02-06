/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

 import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Objek Persegi
        Persegi persegi = new Persegi();
        System.out.print("Masukkan sisi persegi: ");
        persegi.setSisi(input.nextFloat());
        System.out.println("Luas Persegi: " + persegi.getLuas());
        System.out.println("Keliling Persegi: " + persegi.getKeliling());

        // Objek Lingkaran
        Lingkaran lingkaran = new Lingkaran();
        System.out.print("\nMasukkan jari-jari lingkaran: ");
        lingkaran.setJari(input.nextFloat());
        System.out.println("Luas Lingkaran: " + lingkaran.getLuas());
        System.out.println("Keliling Lingkaran: " + lingkaran.getKeliling());

        // Objek Persegi Panjang
        PersegiPanjang pp = new PersegiPanjang();
        System.out.print("\nMasukkan panjang persegi panjang: ");
        pp.setPanjang(input.nextFloat());
        System.out.print("Masukkan lebar persegi panjang: ");
        pp.setLebar(input.nextFloat());
        System.out.println("Luas Persegi Panjang: " + pp.getLuas());
        System.out.println("Keliling Persegi Panjang: " + pp.getKeliling());

        // Objek Segitiga
        Segitiga segitiga = new Segitiga();
        System.out.print("\nMasukkan alas segitiga: ");
        segitiga.setAlas(input.nextFloat());
        System.out.print("Masukkan tinggi segitiga: ");
        segitiga.setTinggi(input.nextFloat());
        System.out.println("Luas Segitiga: " + segitiga.getLuas());
        System.out.println("Keliling Segitiga (sederhana): " + segitiga.getKeliling());

        input.close();
    }
}
  

