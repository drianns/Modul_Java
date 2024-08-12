/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab6_soal2;

import java.util.Scanner;

/**
 *
 * @author RPL-SMKN 4 BOGOR
 */
public class Bab6_soal2 {

    public static void main(String[] args) {
         Scanner input = new Scanner(System.in);
        
        System.out.println("NAMA ? :");
        String nama = input.nextLine();
        
        System.out.println("NIM ? :");
        int nim = input.nextInt();
       
        System.out.println("NILAI ? :");
        int Nilai = input.nextInt();
       
        if(Nilai<50){
 System.out.println("Keterangan : Tidak Lulus ");
 }
 else if(Nilai>=50 && Nilai<60){
 System.out.println("grade D ");
 System.out.println("Keterangan : Remedial ");
 }
 else if(Nilai>=60 && Nilai<70){
 System.out.println("grade C ");
 System.out.println("Keterangan : Remedial ");
 }
 else if(Nilai>=70 && Nilai<80){
 System.out.println("grade B ");
 System.out.println("Keterangan : Lulus ");
 }
 else if(Nilai>=80 && Nilai<90){
 System.out.println("grade A ");
 System.out.println("Keterangan : Lulus ");
 
 }else if(Nilai>=90 && Nilai<100){
 System.out.println("grade A+");
 System.out.println("Keterangan : Lulus ");
 }else{
 System.out.println("Data Nilai Salah !"); 
    }
}
}
