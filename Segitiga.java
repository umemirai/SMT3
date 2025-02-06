/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;


    public class Segitiga extends BangunDatar {
    // Atribut private (-)
    private float alas;
    private float tinggi;

    // Setter alas
    public void setAlas(float alas) {
        this.alas = alas;
    }

    // Setter tinggi
    public void setTinggi(float tinggi) {
        this.tinggi = tinggi;
    }

    // Getter alas
    public float getAlas() {
        return alas;
    }

    // Getter tinggi
    public float getTinggi() {
        return tinggi;
    }

    // Implementasi abstract method luas
    @Override
    public float luas() {
        return (alas * tinggi) / 2;
    }

    // Implementasi abstract method keliling (contoh sederhana: segitiga sama sisi)
    @Override
    public float keliling() {
        return alas * 3;
   }
    }

