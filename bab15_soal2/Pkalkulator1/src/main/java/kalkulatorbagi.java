/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import kalkulatorpack.kalkulator;
/**
 *
 * @author ADVAN
 */
public class kalkulatorbagi {

    public static void main(String[] args) {
        // Membuat objek kalkulator
        kalkulator objek = new kalkulator();
        
        // Menggunakan method pembagian
        float hasilBagi = objek.pembagian(50.0f, 2.0f);
        System.out.println("Pembagian: " + hasilBagi);
    }
}
