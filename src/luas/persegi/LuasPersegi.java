
package luas.persegi;

import java.util.Scanner;

public class LuasPersegi {
    public static void main(String[] args) {
       double luas;
       int s;
       
      Scanner input = new Scanner(System.in);
       
      System.out.println("<< Program Hitung Luas Persegi>>");
      System.out.print("Input sisi: ");
      s = input.nextInt();
      
      luas = s * s;
      
     System.out.println("Luasnya : " +luas+"Cm");

    }
    
}
