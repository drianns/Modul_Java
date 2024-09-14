/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.segitigaoverl;

/**
 *
 * @author ADVAN
 */

public class SegitigaOverL {

    int alas;
    int tinggi;
    int luas;

    public SegitigaOverL(int alas, int tinggi) {
        this.alas = alas;
        this.tinggi = tinggi;
        this.luas = 0;
    }

    public void hitungLuas(int alas, int tinggi) {
        this.luas = (alas * tinggi) / 2; // 
    }

    public void tampilkanLuas() {
        System.out.println("Luas segitiga: " + this.luas);
    }
}
