
package WSI.Tugas;


public class Person1 {
    
    String nama;
    int umur;

    public Person1 (String nama, int umur){

        this.nama = nama;
        this.umur = umur; 
    }
    
    public String getName(){
        return nama;
    }
    
    public int getAge(){
        return umur;
}
    
    public void setAge (int umur){
        this.umur = umur;
        
    }
    
}