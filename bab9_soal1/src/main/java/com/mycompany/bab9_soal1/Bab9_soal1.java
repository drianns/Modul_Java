/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.bab9_soal1;

/**
 *
 * @author PC RPL - R1
 */
public class Bab9_soal1 {

    public static void main(String[] args) {
  int i = 1; // variabel untuk baris
        while (i <= 5) {
            int j = 1; // variabel untuk jumlah bintang
            while (j <= i) {
                System.out.print("* ");
                j++;
            }
            System.out.println(); // baris baru setelah setiap baris selesai
            i++;
        }
    }
}