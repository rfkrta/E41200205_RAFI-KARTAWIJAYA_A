
package Pewarisan;

/**
 *
 * @author rafikarta
 */
public class B extends A { //deklarasikan B yang diturunkan dari A
    int z;
    
    void TampilkanJumlah(){//subclass dapat mengakses dari superclass
        System.out.println("Jumlah :" + (x+y+z));
    }
    
}
