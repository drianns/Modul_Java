/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.paritmatika;

/**
 *
 * @author ADVAN
 */
class Op extends OpAritmatika {
    
    public Op(double A, double B) {
        super(A, B);
    }

    @Override
    protected double penjumlahan() {
        return A + B;
    }

    @Override
    protected double pengurangan() {
        return A - B;
    }

    @Override
    protected double perkalian() {
        return A * B;
    }

    @Override
    protected double pembagian() {
        if (B == 0) {
            System.out.println("Pembagi tidak boleh nol.");
            return 0;
        }
        return A / B;
    }
}
