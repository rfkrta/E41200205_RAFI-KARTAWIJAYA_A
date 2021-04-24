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
public class User2App {
    public static void main(String[] args){
        TelevisiModern tv = new TelevisiModern("TV Modern, 29 inches", 100);
        String [] semuaChannel = {"RCTI", "SCTV", "INDOSIAR", "LA TV",
                                  "METRO TV", "TRANS TV", "MNCTV", "TV 7",
                                   "TVRI", "G TV", "ANTV"};
        
        System.out.println("Pak Rusmanto, membeli Televisi : " + tv.Desk());
        
        tv.getChannel();
        tv.setChannel(semuaChannel);
        tv.setChannelAktif(3);
        tv.Volume(10);
        tv.setChannelAktif(10);
        tv.setChannelAktif(1);
        tv.setModusTampilan(TelevisiModern.TELETEXT);
        tv.setHalamanTeletext(250);
        tv.setModusTampilan(TelevisiModern.TV);
        tv.playCD();
        tv.setDiscTray("Mallaficent");
        tv.playCD();
    }
    
}
