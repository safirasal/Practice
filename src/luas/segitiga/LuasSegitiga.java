
package luas.segitiga;
import java.util.Scanner;
public class LuasSegitiga {
    
    public static void main(String[] args) {
      double luas;
      int alas, tinggi;
       
      Scanner input = new Scanner(System.in);
       
      System.out.println("<< Program Hitung Luas Segitiga>>");
      System.out.print("Input Alas: ");
      alas = input.nextInt();
      System.out.print("Input Tinggi: ");
      tinggi = input.nextInt();
      
      luas = Double.valueOf((alas * tinggi)/2);
      
      System.out.println("Luasnya : " +luas);
    }
    
}
