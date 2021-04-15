package WSI.Latihan;

class book{
    int price;
    int pages;
    
    public void set (int price, int pages){
        
        this.price = price;
        this.pages = pages;
        
    }
    
    public void show (){
        
        System.out.println("informasi buku");
        System.out.println("harga buku : " + price);
        System.out.println("jumlah halaman :"+pages);
        
    }
}


public class latihan3 {
        public static void main(String[] args) {
            book javabook = new book();
            javabook.set(60000, 112);
            javabook.show();
            
        }
        
    }



