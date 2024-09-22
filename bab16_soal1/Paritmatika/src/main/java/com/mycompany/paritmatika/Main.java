/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paritmatika;

/**
 *
 * @author ADVAN
 */
public class Main {
    public static void main(String[] args) {
        double A = 9.5;
        double B = 2.5;
        
        Op operasi = new Op(A, B);

        System.out.println("Penjumlahan: " + operasi.penjumlahan());
        System.out.println("Pengurangan: " + operasi.pengurangan());
        System.out.println("Perkalian: " + operasi.perkalian());
        System.out.println("Pembagian: " + operasi.pembagian());
    }
}