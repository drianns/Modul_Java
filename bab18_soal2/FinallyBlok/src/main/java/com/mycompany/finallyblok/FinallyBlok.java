/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.finallyblok;

/**
 *
 * @author ADVAN
 */
class FinallyBlok {     
    public static void main(String args[]) {     
        try {       
            Float data = 500f / 15;     
            System.out.println(data);     
        }     
        catch (NullPointerException e) {   
            System.out.println(e);   
        }     
        finally {   
            System.out.println("blok finally akan selalu di eksekusi");   
        }     
    }     
}
