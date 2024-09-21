/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import kalkulatorpack.kalkulator;
/**
 *
 * @author ADVAN
 */
public class kalkulatorkali {
    public static void main(String[] args) {
        // Membuat objek kalkulator
        kalkulator objek = new kalkulator();
        
        // Menggunakan method perkalian
        float hasilKali = objek.perkalian(7.0f, 3.0f);
        System.out.println("Perkalian: " + hasilKali);
    }
}
