/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8_soal2;
import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab8_soal2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        
        System.out.print("TAHUN AKHIR ? :");
        int akhir = input.nextInt();
        
        System.out.print("TAHUN AWAL ? :");
        int awal = input.nextInt();
        
        
        System.out.println("Hasil nya :" + akhir + "sampai" + awal + ":");
        for (int tahun = akhir; tahun >= awal; tahun--){
            System.out.println(tahun);
    }
        input.close();
}
}
