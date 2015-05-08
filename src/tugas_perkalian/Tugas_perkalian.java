/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package tugas_perkalian;

import java.util.Scanner;

/**
 *
 * @author SBC4
 */
public class Tugas_perkalian {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner Inputan = new Scanner (System.in);

int Pertama, Kedua, Ketiga, Keempat, HasilJumlah;

System.out.print("1. Masukan Angka : ");    

Pertama = Inputan.nextInt();

System.out.print("2. Masukan Angka : ");    

Kedua = Inputan.nextInt();

System.out.print("3. Masukan Angka : ");  

Ketiga = Inputan.nextInt();

System.out.print("4. Masukan Angka : ");    

Keempat = Inputan.nextInt();    

HasilJumlah = Pertama + Kedua + Ketiga + Keempat;

System.out.println("Hasil Dari Penjumlahan "+Pertama+" + "+Kedua+" + "+Ketiga+" + "+Keempat+" = "+HasilJumlah);
    }
}
