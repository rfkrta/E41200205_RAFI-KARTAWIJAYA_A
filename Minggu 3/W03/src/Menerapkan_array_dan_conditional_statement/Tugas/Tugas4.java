
package Menerapkan_array_dan_conditional_statement.Tugas;

import java.util.Scanner;

/**
 *
 * @author ASUS
 */
public class Tugas4 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("------------------------------------");
        System.out.println("             RAPSTORE");
        System.out.println("   Promo Belanja Berhadiah");
        System.out.println("Khusus Pembelian 5 Barang Pertama");
        System.out.println(" Dengan Harga minimum Rp 10000,00");
        System.out.println("------------------------------------");
        System.out.print("Masukkan nama pembeli : ");
        String nama = scn.nextLine();
        
         String Promo = " ";
         int Jumlah =0;
         int Harga[] = new int[6];
         for (int i = 1; i < Harga.length; i++) {
             System.out.println("Masukkan harga barang ke " + i + " :");
             Harga[i] = scn.nextInt();
             Jumlah += Harga[i];
            
        }
              System.out.println("Total harga pembelian atas "+ nama + "  " +Jumlah );
              for (int i = 0; i < Harga.length; i++) {
                  if (Harga[i] >= 10000){
                  Promo = "bonus";
              }
              else {
                  Promo = "tidak bonus";
                  break;
              }
            
        }
              switch (Promo) {
                  case "bonus":
                      System.out.println("Selamat....");
                      System.out.println("Anda mendapatkan hadiah 1 mug ganteng");
                      break ;
                  case "tidak bonus" :
                      System.out.println("Tidak Mendapat Bonus");
              }
               System.out.println("-------------------------------------------------------------------------");
               System.out.println("                             Terima Kasih");
               System.out.println("                 Anda sudah berbelanja di RAPSTORE");

    }
        }
    
        
       
        
    
    

