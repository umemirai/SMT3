/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;


    public class Persegi extends BangunDatar {
    // Atribut private (-)
    private float sisi;

    // Setter sisi
    public void setSisi(float sisi) {
        this.sisi = sisi;
    }

    // Getter sisi
    public float getSisi() {
        return sisi;
    }

    // Implementasi abstract method luas
    @Override
    public float luas() {
        return sisi * sisi;
    }

    // Implementasi abstract method keliling
    @Override
    public float keliling() {
        return 4 * sisi;
    }
}

