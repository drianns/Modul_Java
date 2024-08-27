/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab10_soal1dan2;

/**
 *
 * @author PC RPL - R1
 */
public class Bab10_soal1dan2 {

    public static void main(String[] args) {
      
        Aritmatika3 aritmatika = new Aritmatika3();
        
        int bilangan1 = 10;
        int bilangan2 = 5;
        
        int hasilPengurangan = aritmatika.pengurangan(bilangan1, bilangan2);
        int hasilPerkalian = aritmatika.perkalian(bilangan1, bilangan2);
        double hasilPembagian = aritmatika.pembagian(bilangan1, bilangan2);
        double hasilPangkat = aritmatika.pangkat(bilangan1, bilangan2);

        System.out.println("Pengurangan: " + bilangan1 + " - " + bilangan2 + " = " + hasilPengurangan);
        System.out.println("Perkalian: " + bilangan1 + " * " + bilangan2 + " = " + hasilPerkalian);
        System.out.println("Pembagian: " + bilangan1 + " / " + bilangan2 + " = " + hasilPembagian);
        System.out.println("Pangkat: " + bilangan1 + " ^ " + bilangan2 + " = " + hasilPangkat);
    }
}