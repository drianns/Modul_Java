/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab8_soal1;
import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab8_soal1 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("NILAI AWAL ? :");
      int Awal = input.nextInt();
        
      System.out.print("NILAI AKHIR ? :");
      int Akhir = input.nextInt();
      
      System.out.println("Hasil nya :" + Awal + "sampai" + Akhir + ":");
      for (int i = Awal; i <= Akhir; i += 5) {
          System.out.println(i);
    }
}
}

