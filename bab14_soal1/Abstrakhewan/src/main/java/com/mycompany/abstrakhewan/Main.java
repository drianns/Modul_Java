/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.abstrakhewan;

/**
 *
 * @author ADVAN
 */
public class Main {
     public static void main(String[] args) {
        
        Abstrakhewan kucing = new Kucing();
        kucing.suara(); 
        kucing.suara2();
        
      
        Abstrakhewan anjing = new Anjing();
        anjing.suara(); 
        anjing.suara2();

    }
}