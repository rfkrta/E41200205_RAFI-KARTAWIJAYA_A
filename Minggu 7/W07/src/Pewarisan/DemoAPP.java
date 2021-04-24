/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Pewarisan;

/**
 *
 * @author rafikarta
 */
public class DemoAPP {
    public static void main(String[] args) {
        A suprClass = new A();
        B subClass = new B();
        
        System.out.println("SuperClass");
        suprClass.x=10;
        suprClass.y=20;
        suprClass.TampilkanNilaiXY();
        
        System.out.println("SubClass");
        subClass.x=5;
        subClass.y=2;
        subClass.TampilkanNilaiXY();
        
        //member tambahan yang hanya ad pada subclass
        
        subClass.z=50;
        subClass.TampilkanJumlah();
        
    }
    
}
