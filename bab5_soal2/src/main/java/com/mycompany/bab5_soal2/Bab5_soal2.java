
/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab5_soal2;
import java.util.Scanner;
/**
 *
 * @author zackg
 */

public class Bab5_soal2 {

    public static void main(String[] args) {
        
        Scanner input = new Scanner (System.in);
       
        System.out.println("Masukan nilai alas:");
        
        int alas = input.nextInt();
        
        System.out.println("Masukan nilai tinggi:");
        
        int tinggi = input.nextInt();
        
        System.out.println("Luas Segitiga: " + alas*tinggi);
    }
}
