/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paritmatika;

/**
 *
 * @author ADVAN
 */
abstract class OpAritmatika {
    protected double A; // Nilai bilangan A
    protected double B; // Nilai bilangan B
    
    public OpAritmatika(double A, double B) {
        this.A = A;
        this.B = B;
    }

    protected abstract double penjumlahan();
    protected abstract double pengurangan();
    protected abstract double perkalian();
    protected abstract double pembagian();
} 
