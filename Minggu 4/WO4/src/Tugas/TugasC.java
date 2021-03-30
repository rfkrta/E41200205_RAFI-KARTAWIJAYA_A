package Tugas;

import java.util.Arrays;
import java.util.Scanner;

public class TugasC {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Masukkan Banyak Data = ");
        int BanyakData;
        BanyakData = sc.nextInt();
        double rata2 = 0;
        double hasil = 0;
        int[] Array = new int[BanyakData];
        
        for (int i = 0; i < BanyakData; i++) {
            System.out.println("Masukkan Data ke - " + (i + 1));
            Array[i] = sc.nextInt();
        }        
        Arrays.sort(Array);
        int min = Array[0];
        int max = Array[0];
        for (int i = 0; i < Array.length; i++) {
            //System.out.println(Array[i]);
        }
        for (int i = 0; i < Array.length; i++) {
            if ( Array[i] > max){
                max = Array[i];
          
            }else
            {
                min = Array[i];
                
            }
            
        }
          System.out.println("Nilai Maximum = "+max);
          System.out.println("Nilai Minimum = " + min);
          
        for (int i = 0; i < Array.length; i++) {
           hasil += Array[i];
           rata2 = hasil/Array.length;
        }
        System.out.println("Rata2 = " + rata2);
    }

}
