package array3;

public class Array3 {
    public static void main(String[] args) {
      String [] dataLaptop = new String [3];
      dataLaptop [0] = "Asus | ROG Strix III-G";
      dataLaptop [1] = "Asus | ROG Zephyrus M";
      dataLaptop [2] = "Asus | Business Notebook";
      
      int [] harga = {37500000, 24999000, 21050000};
      System.out.println ("HARGA LAPTOP ASUS 2020");
      System.out.println ("-------------------------");
      
      System.out.println (" 1."+ dataLaptop [0]+ " : " + "Rp." + harga [0]);
      System.out.println (" 2."+ dataLaptop [1]+ " : " + "Rp." + harga [1]);
      System.out.println (" 3."+ dataLaptop [2]+ " : " + "Rp." + harga [2]);
    }
    
}
