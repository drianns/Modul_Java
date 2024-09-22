/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.oparitmatika1;

/**
 *
 * @author ADVAN
 */
class Perkalian extends OpAritmatika1 {

    public Perkalian(double A, double B) {
        super(A, B);
    }

    @Override
    protected double operasi() {
        return A * B;
    }
}
