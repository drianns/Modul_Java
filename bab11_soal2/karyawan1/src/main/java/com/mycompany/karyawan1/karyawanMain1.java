/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.karyawan1;
import java.util.Scanner;
/**
 *
 * @author ADVAN
 */
public class karyawanMain1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Input data dari pengguna
        System.out.print("Masukkan Id Karyawan: ");
        int idKaryawan = scanner.nextInt();
        scanner.nextLine();  // Clear buffer
        System.out.print("Masukkan Nama Karyawan: ");
        String namaKaryawan = scanner.nextLine();
        System.out.print("Masukkan Golongan (1-5): ");
        String golongan = scanner.nextLine();

        // Variabel untuk jabatan dan gaji pokok
        String jabatan = "";
        double gajiPokok = 0.0;

        // Tentukan jabatan dan gaji pokok berdasarkan golongan
        switch (golongan) {
            case "1":
                jabatan = "Assisten Staff";
                gajiPokok = 3000000;
                break;
            case "2":
                jabatan = "Staff";
                gajiPokok = 3500000;
                break;
            case "3":
                jabatan = "Supervisor";
                gajiPokok = 4000000;
                break;
            case "4":
                jabatan = "Assisten Manager";
                gajiPokok = 5000000;
                break;
            case "5":
                jabatan = "Manager";
                gajiPokok = 6000000;
                break;
            default:
                System.out.println("Golongan tidak valid!");
                return; // Hentikan program jika golongan tidak valid
        }

        // Membuat objek Karyawan dan memanggil metode info
        Karyawan1 objek1 = new Karyawan1(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);
        objek1.info();
        Karyawan1 objek2 = new Karyawan1(idKaryawan, namaKaryawan, golongan, jabatan, gajiPokok);
        objek2.info();
    }
}

