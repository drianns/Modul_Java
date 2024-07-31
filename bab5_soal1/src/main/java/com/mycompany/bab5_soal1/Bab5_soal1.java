package com.mycompany.bab5_soal1;

import java.util.Scanner;


/**
 *
 * @author zackg
 */
public class Bab5_soal1 {
    public static void main(String[] args) {
        
Scanner input = new Scanner (System.in) ;
       System.out.println("Masukan Nama Anda:");
       
       String nama = input.nextLine();
       
       System.out.println("Masukan Alamat Anda:");
       
       String alamat = input.nextLine();
       
       System.out.println("Masukan Usia Anda:");
       
       int usia = input.nextInt();
       
       System.out.println("Masukan Gaji Anda:");
       
       int gaji = input.nextInt();
       
       
       System.out.println("Nama Karyawan: " + nama);
       System.out.println("Alamat : " + alamat);
       System.out.println("Usia : " + usia + "tahun");
       System.out.println("Gaji : " + "Rp " + gaji);


    }
}
