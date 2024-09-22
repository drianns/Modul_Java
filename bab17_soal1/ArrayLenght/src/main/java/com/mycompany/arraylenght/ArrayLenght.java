/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.arraylenght;
import java.util.Scanner;
/**
 *
 * @author ADVAN
 */
public class ArrayLenght {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan Jumlah Kota: ");
        int jumlahKota = input.nextInt();
        input.nextLine(); 

        String[] kota = new String[jumlahKota];

        for (int i = 0; i < jumlahKota; i++) {
            System.out.print("Kota ke " + (i + 1) + ": ");
            kota[i] = input.nextLine();
        }

        System.out.println("Kota-kota yang dimasukkan:");
        for (String k : kota) {
            System.out.println(k);
        }

        input.close();
    }
}
