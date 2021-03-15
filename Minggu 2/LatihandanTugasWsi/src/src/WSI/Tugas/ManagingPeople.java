/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSI.Tugas;

/**
 *
 * @author Rafi
 */
public class ManagingPeople {
    public static void main(String[] args) {
        
        Person1 p1 = new Person1("Udin", 19);
        Person1 p2 = new Person1("Taufik", 45);
        
        if(p1.getAge()==p2.getAge())
        {
            System.out.println(p1.getName()+" "+ " seumuran dengan "+ p2.getName());
        }
        
        else
        {
            System.out.println(p1.getName()+ " " + "Tidak Seumuran dengan"+ " "+p2.getName());
        }
        
    }
    
}
