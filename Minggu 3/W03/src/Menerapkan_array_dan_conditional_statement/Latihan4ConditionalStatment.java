
package Menerapkan_array_dan_conditional_statement;

import java.util.Scanner;



public class Latihan4ConditionalStatment {
    public static void main(String[] args) {
        // membuat variabel dan scanner
        
        int nilai;
        String grade;
        Scanner scan = new Scanner(System.in);
        //mengambil input 
        System.out.print("Masukkan Nilai: ");
        nilai = scan.nextInt();
        
        //gradenya
        if (nilai >=88){
            grade = "A";
        } else if (nilai >= 80){
            grade = "B+";
            
        } else if (nilai >= 70) {
            grade = "B";
        } else if (nilai >= 60 ){
            grade = "C+";
        } else if (nilai >= 50){
            grade = "C";
        } else if (nilai >=40){
            grade = "D";
        } else {
            grade = "E";
       
        }
        
        //cetak hasil
        
        System.out.println("Grade: " + grade);
        
    }
}
