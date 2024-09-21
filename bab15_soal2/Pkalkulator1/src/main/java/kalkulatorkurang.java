/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import kalkulatorpack.kalkulator;
/**
 *
 * @author ADVAN
 */
public class kalkulatorkurang {
    public static void main(String[] args) {
        // Membuat objek kalkulator
        kalkulator objek = new kalkulator();
        
        // Menggunakan method pengurangan
        int hasilKurang = objek.pengurangan(50, 20);
        System.out.println("Pengurangan: " + hasilKurang);
    }
}
