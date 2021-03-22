
package Menerapkan_array_dan_conditional_statement.Tugas;

import java.util.Scanner;

/**
 *
 * @author rafi
 */
public class Tugas5 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println(" CAFE JAMAL");
        System.out.println("ANEKA MINUMAN");
        System.out.println("------------------");
        System.out.println("   SPECIAL MENU :");
        System.out.println("1. Joshua");
        System.out.println("2. Milk Shake");
        System.out.println("3. V60(Robusta)");
        System.out.println("4. Lemon Tea");
        System.out.println("5. Ice Tea");
        System.out.println("------------------");
        
        System.out.print("Silahkan Masukkan Nama Pembeli : ");
        String nama = scn.nextLine();
        System.out.print("Silahkan Masukkan Pilihan Anda : ");
        int menu = scn.nextInt();
        
        String Menuu = "";
        switch (menu){
            case 1 :
                Menuu = "Joshua";
                break;
            case 2 :
                Menuu = "Milk Shake";
                break;
            case 3 : 
                Menuu = "V60 (Robusta)";
                break;
            case 4 :
                Menuu = "Lemon Tea";
                break;
            case 5 :
                Menuu = " Ice Tea";
            default :
                System.out.println("Tidak Ada Dalam Menu");
                break;
        } 
        System.out.print("Minuman yang anda pilih : " + Menuu);
        System.out.println("Pesanan anda akan segera di antar");
        System.out.println("Terima Kasih " + nama + " telah berkunjung ke JAMAL Cafe");

    }
}
