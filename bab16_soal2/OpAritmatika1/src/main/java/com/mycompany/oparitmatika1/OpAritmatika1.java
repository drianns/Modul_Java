/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.oparitmatika1;

/**
 *
 * @author ADVAN
 */
class OpAritmatika1 {
    protected double A; // Nilai bilangan A
    protected double B; // Nilai bilangan B
    
    // Constructor untuk menetapkan nilai A dan B
    public OpAritmatika1(double A, double B) {
        this.A = A;
        this.B = B;
    }

    // Method yang akan di-override oleh kelas turunan
    protected double operasi() {
        return 0; // Default
    }
}