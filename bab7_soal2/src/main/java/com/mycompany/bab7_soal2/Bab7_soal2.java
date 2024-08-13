/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab7_soal2;
import java.util.Scanner;
/**
 *
 * @author PC RPL - R1
 */
public class Bab7_soal2 {

    public static void main(String[] args) {
       Scanner input = new Scanner(System.in);
       
      System.out.println("Masukan NIM Anda:");
      int nim = input.nextInt();
       
      input.nextLine(); 
      
       System.out.println("Masukan Nama anda :");
       String nama = input.nextLine();
       
      System.out.println("Masukan Tahun Anda:");
      int tahun = input.nextInt();

      input.nextLine();
      
      System.out.println("Masukan Peminatan anda :");
      char peminatan = input.next().charAt(0);
       
       switch( tahun )
 {
 case 1:
 System.out.println("Bahasa Inggris,Matematika, Sain");
 break;
 
case 2: 
 switch( peminatan)
 {
 case 'C':
 System.out.println("Sistem Operasi, Pemrograman Java, Struktur Data");
 break;
 
 case 'E':
 System.out.println("Algoritma, Logika Informatika");
 break;
 
 case 'M':
 System.out.println("DBMS,Manajemen Proyek ");
 break;
 }
 break;
 
 case 3:
 switch( peminatan )
 {
 case 'C':
 System.out.println("Organisasi Komputer, MultiMedia");
 break;
 case 'E':
 System.out.println("Perancangan Sistem, Pemrograman WEB");
 break;
 case 'M':
 System.out.println("Pemrograman Mobile, Pemrograman Java 2");
 break;
 }
 break;
 case 4:
 switch( peminatan)
 {
 case 'C':
 System.out.println("Komunikasi Data, MultiMedia");
 break;
 case 'E':
 System.out.println(" Sistem Terdistribusi , Image Processing");
 break;
 case 'M':
 System.out.println("SIM , Sistem Jaringan ");
 break;
 }
 break;
 
 }
 }
}