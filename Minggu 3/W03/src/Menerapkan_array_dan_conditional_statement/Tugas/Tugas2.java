
package Menerapkan_array_dan_conditional_statement.Tugas;

import java.util.Scanner;

/**
 *
 * @author Rafi
 */
public class Tugas2 {
    public static void main(String[] args) {
        int array;
        Scanner sc = new Scanner(System.in);
        System.out.print("Panjang array : " );
        int PanjangArray = sc.nextInt();
        int NilaiArray[] = new int[PanjangArray];
        System.out.println("Masukkan Nilai Array : ");
        for (int i =0; i<PanjangArray; i++){
        NilaiArray[i]= (int)(Math.random()*20+1);
    }
        System.out.println("Array = ");
        for (int i=0;i<PanjangArray;i++){
        System.out.print(" "+NilaiArray[i]);
            System.out.println("");
        }
        
    }
}
