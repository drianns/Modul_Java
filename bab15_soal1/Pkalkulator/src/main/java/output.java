/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import kalkulatorpack.kalkulator;
/**
 *
 * @author ADVAN
 */
public class output {
    
public static void main(String[] args) {
       
        kalkulator objek = new kalkulator();
        
        System.out.println("Pertambahan: " + objek.pertambahan(10, 30));
        System.out.println("Pengurangan: " + objek.pengurangan(50, 20));
        System.out.println("Pembagian: " + objek.pembagian(50.0f, 2.0f));
        System.out.println("Perkalian: " + objek.perkalian(7.0f, 3.0f));
    }
}