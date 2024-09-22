/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception;

/**
 *
 * @author ADVAN
 */
public class Throw {

    public static void cekUsia(int usia) {
        if (usia < 18) {
            throw new IllegalArgumentException("Usia harus 18 tahun atau lebih.");
        } else {
            System.out.println("Usia valid: " + usia);
        }
    }

    public static void main(String[] args) {
        try {
            cekUsia(16);
        } catch (IllegalArgumentException e) {
            System.out.println("Terjadi kesalahan: " + e.getMessage());
        }
        cekUsia(18);
    }
}

