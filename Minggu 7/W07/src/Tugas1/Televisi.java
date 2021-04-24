/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author ASUS
 */
public class Televisi {
    String slew;
    int i;
    
    Televisi(String info, int i) {
    this.slew = info;
    this.i = i;
    }
    
    
    public String Desk (){
        return(slew+i);
    }
    
    String [] channel = new String[i];

    
    public void getChannel() {
    
        if (channel.length  == 0) {
            System.out.println("Belum ada channel yang diset !!");
        } else {
            System.out.println(" Sudah di set!! ");
        }
}
    
 public void setChannel(String [] semuaChannel){
     if (i >= semuaChannel.length) {
         channel = semuaChannel;
                  System.out.println("Informasi Channel berhasil di update!");
     }else {

         System.out.println("Maaf tv hanya dapat menyimpan " + i +" channel");
     }
 }
 
 public void setChannelAktif(int x){
     if (x >= channel.length) {
         System.out.println("Channel yg anda ingin belum di set");
     }else{
         System.out.println("Pindah Channel ke :  " + channel[x]);
     }
 }
 
 
 public void Volume(int x){
     System.out.println("Volume = "+ x);
 }
    
 
}
