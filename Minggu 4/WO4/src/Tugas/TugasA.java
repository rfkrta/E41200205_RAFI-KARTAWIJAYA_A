 
package Tugas;

import java.util.Scanner;

public class TugasA { 
    public static void main(String[] args) {
        int NilaiTerkecil;
        int NilaiTerbesar;
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Nilai Terkecil = ");
        NilaiTerkecil = sc.nextInt();
        for (int x = 0; x < NilaiTerkecil ; x++) {    
        }
        System.out.println("Masukkan Nilai Terbesar = ");
        NilaiTerbesar = sc.nextInt();
        for (int i = NilaiTerkecil; i <= NilaiTerbesar; i++){
                if ( i % 2 == 0){
                System.out.println(i + "");
            }
            
        }
        
    }
    
}
