/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exception;

/**
 *
 * @author ADVAN
 */
public class TryCatch {   
    public static void main(String[] args) {   
        try {   
            int data = 50 / 0; // Ini dapat melempar ArithmeticException   
        }   
        // Menangkap dan menangani exception   
        catch (ArithmeticException e) {   
            System.out.println("Exception ditangkap :" + e);   
        }   
        // Kode di luar blok try-catch tetap dieksekusi
        System.out.println("Rest of the code");   
    }   
}
