/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

public class Lingkaran extends BangunDatar {
    // Atribut private (-)
    private float jari;

    // Setter jari-jari
    public void setJari(float jari) {
        this.jari = jari;
    }

    // Getter jari-jari
    public float getJari() {
        return jari;
    }

    // Implementasi abstract method luas
    @Override
    public float luas() {
        return (float) (Math.PI * jari * jari);
    }

    // Implementasi abstract method keliling
    @Override
    public float keliling() {
        return (float) (2 * Math.PI * jari);
    }
}

