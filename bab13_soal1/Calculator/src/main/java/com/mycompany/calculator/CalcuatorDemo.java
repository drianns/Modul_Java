/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.calculator;

/**
 *
 * @author ADVAN
 */
public class CalcuatorDemo {

   public static void main(String args[]) 
   { 
    Calculator objek = new Calculator(); 
    

       System.out.println("Penjumlahan: " + objek.tambah(20, 10));    
       System.out.println("Pengurangan: " + objek.kurang(10, 20));  
       System.out.println("Perkalian: " + objek.kali(20, 10));    
       System.out.println("Pembagian: " + objek.bagi(20, 10));   
   } 
}

