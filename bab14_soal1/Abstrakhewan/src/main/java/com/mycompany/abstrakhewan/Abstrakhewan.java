/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.abstrakhewan;

/**
 *
 * @author ADVAN
 */
 abstract class Abstrakhewan {

    public abstract void suara();

    // Method non-abstract (konkrit)
    public void suara2() {
        System.out.println("Ini method konkrit dari parent class");
    }
}
