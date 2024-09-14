/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pegawai;

/**
 *
 * @author ADVAN
 */

public class pekerjaan extends Pegawai {
    public int bonus = 1000000;

    // Metode untuk menghitung gaji total
    public int hitungGajiTotal() {
        return gaji + bonus + tunjanganMakan + transport;
    }

    public static void main(String args[]) {
        // Membuat objek Pekerjaan
        pekerjaan pekerjaan = new pekerjaan();

        // Menampilkan gaji dasar, bonus, dan gaji total
        System.out.println("Gaji System Analyst: " + pekerjaan.gaji);
        System.out.println("Bonus: " + pekerjaan.bonus);
        System.out.println("Tunjangan Makan: " + pekerjaan.tunjanganMakan);
        System.out.println("Transport: " + pekerjaan.transport);
        System.out.println("Gaji Total: " + pekerjaan.hitungGajiTotal());
    }
}

