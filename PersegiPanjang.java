/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Abstrak;

   public class PersegiPanjang extends BangunDatar {
    // Atribut private (-)
    private float panjang;
    private float lebar;

    // Setter panjang
    public void setPanjang(float panjang) {
        this.panjang = panjang;
    }

    // Setter lebar
    public void setLebar(float lebar) {
        this.lebar = lebar;
    }

    // Getter panjang
    public float getPanjang() {
        return panjang;
    }

    // Getter lebar
    public float getLebar() {
        return lebar;
    }

    // Implementasi abstract method luas
    @Override
    public float luas() {
        return panjang * lebar;
    }

    // Implementasi abstract method keliling
    @Override
    public float keliling() {
        return 2 * (panjang + lebar);
    }
}
 
