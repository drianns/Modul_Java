/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.karyawan;

/**
 *
 * @author ADVAN
 */
public class Karyawan { 
    int IdKaryawan;   
    String NamaKaryawan;
    String Golongan;
    String Jabatan;
    double GajiPokok;

    Karyawan(int id, String nama, String gol, String jabatan, double gajiPokok) {   
        this.IdKaryawan = id;   
        this.NamaKaryawan = nama;
        this.Golongan = gol;
        this.Jabatan = jabatan;
        this.GajiPokok = gajiPokok;
    }   
    
    void info() { 
        System.out.println("Id Karyawan : " + IdKaryawan); 
        System.out.println("Nama: " + NamaKaryawan);
        System.out.println("Golongan: " + Golongan);
        System.out.println("Jabatan: " + Jabatan);
        System.out.println("Gaji Pokok: " + GajiPokok);
        System.out.println();
    }
}
