/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oparitmatika1;

/**
 *
 * @author ADVAN
 */
public class Main {
    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;

        // Polymorphism dengan referensi ke superclass
        OpAritmatika1 operasi;

        // Penjumlahan
        operasi = new Penjumlahan(A, B);
        System.out.println("Penjumlahan: " + operasi.operasi());

        // Pengurangan
        operasi = new Pengurangan(A, B);
        System.out.println("Pengurangan: " + operasi.operasi());

        // Perkalian
        operasi = new Perkalian(A, B);
        System.out.println("Perkalian: " + operasi.operasi());

        // Pembagian
        operasi = new Pembagian(A, B);
        System.out.println("Pembagian: " + operasi.operasi());
    }
}
