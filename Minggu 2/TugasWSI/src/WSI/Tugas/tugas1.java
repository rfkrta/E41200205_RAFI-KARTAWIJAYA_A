/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package WSI.Tugas;

class person {
    
    String fName;
    String lName;
    int stuID;
    String stuStatus;
    
public void set (String fName,String lname,int stuID,String stuStatus){
        
    this.fName = fName;
    this.lName = lname;
    this.stuID = stuID;
    this.stuStatus = stuStatus;
   
    }

public void show (){
    
    System.out.println("Student Name" + fName + " " + lName );
    System.out.println("Student ID = " +stuID);
    System.out.println("Student status = " + stuStatus);
       
}       
}
    
 public class tugas1 {
       
        public static void main(String[] args) {
           person jamal = new person ();
           jamal.set ("Jamal", "Subandi", 41200205, "Aktif");
           jamal.show();
           
       }
        
    }
    

