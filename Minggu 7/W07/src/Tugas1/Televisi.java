/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Tugas1;

/**
 *
 * @author rafikarta
 */
public class Televisi {
    String tv;
    int jumlahchannel;
    
    Televisi(String info, int jumlahChannel) {
    this.tv = info;
    this.jumlahchannel = jumlahChannel;
    }
    
    
    public String Desk (){
        return(tv);
    }
    
    String [] channel = new String[jumlahchannel];

    
    public void getChannel() {
    
        if (channel.length  == 0) {
            System.out.println("Belum ada channel yang diset !!");
        } else {
            System.out.println(" Sudah di set!! ");
        }
}
    
 public void setChannel(String [] semuaChannel){
     if (jumlahchannel >= semuaChannel.length) {
         channel = semuaChannel;
                  System.out.println("Informasi Channel berhasil di update!");
     }else {

         System.out.println("Maaf tv hanya dapat menyimpan " + jumlahchannel +" channel");
     }
 }
 
 public void setChannelAktif(int jumlahChannel){
     if (jumlahChannel >= channel.length) {
         System.out.println("Channel yg anda ingin belum di set");
     }else{
         System.out.println("Pindah Channel ke :  " + channel[jumlahChannel]);
     }
 }
 
 
 public void Volume(int x){
     System.out.println("Volume = "+ x);
 }
   
}
