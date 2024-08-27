/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9_soal2;
   import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab9_soal2 {

    public static void main(String[] args) {
    
        Scanner scanner = new Scanner(System.in);

       
        System.out.print("Masukan bilangan awal: ");
        int awal = scanner.nextInt();

        System.out.print("Masukan bilangan akhir: ");
        int akhir = scanner.nextInt();

        
        System.out.print("Hasil deret bilangan: ");
        int bilangan = awal;

       
        while (bilangan <= akhir) {
            
            System.out.print(bilangan);
            
           
            if (bilangan + 5 <= akhir) {
                System.out.print(", ");
            }
            
            
            bilangan += 5;
        }

       
        scanner.close();
    }
}
