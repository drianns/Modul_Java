/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.calculator;

/**
 *
 * @author ADVAN
 */
public class Calculator {
 
    int tambah(int a, int b) 
    { 
         return a+b; 
    } 
    int kurang(int a, int b) {
        return a - b;
    }
     int kali(int a, int b) {
        return a * b;
    }
    int bagi(int a, int b) {
        if (b != 0) {
            return a / b;
        } else {
            System.out.println("Error: tidak boleh 0");
            return 0;
        }
    }
}
