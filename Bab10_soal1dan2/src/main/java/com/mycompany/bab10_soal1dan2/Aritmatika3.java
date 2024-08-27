/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.bab10_soal1dan2;

/**
 *
 * @author PC RPL - R1
 */
public class Aritmatika3 {
  
    public int pengurangan(int a, int b) {
        return a - b;
    }
    public int perkalian(int a, int b) {
        return a * b;
    }

    public double pembagian(int a, int b) {
        if (b == 0) {
            throw new ArithmeticException("Pembagi tidak boleh nol.");
        }
        return (double) a / b;
    }

    public double pangkat(int a, int b) {
        return Math.pow(a, b);
    }
}