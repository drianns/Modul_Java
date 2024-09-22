/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ibukota;

/**
 *
 * @author ADVAN
 */
public class IbuKota {
    public static void main(String[] args) {
        // Membuat array multidimensi untuk negara dan ibukotanya
        String[][] negaraIbukota = {
            {"Indonesia", "Jakarta"},
            {"Jepang", "Tokyo"},
            {"Iran", "Teheran"},
            {"Malaysia", "Kuala Lumpur"},
            {"Thailand", "Bangkok"}
        };

        // Mengakses array dan menampilkan hasil
        for (int i = 0; i < negaraIbukota.length; i++) {
            System.out.println("Ibukota " + negaraIbukota[i][0] + " adalah " + negaraIbukota[i][1]);
        }
    }
}

