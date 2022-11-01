package array5;
import java.util.Scanner;
public class Array5 {
    public static void main(String[] args) {
        int matrix [][] = new int [5][5];
        System.out.print ("Masukkan nilai awal:");
        
        Scanner scan = new Scanner (System.in);
        int nilai = scan.nextInt();
        
        System.out.println ("Matrix:");
        for (int a=0;a<5;a++){
        for (int b=0;b<5;b++){
            matrix [0][0] = nilai;
            matrix [a][b] = nilai++;
            System.out.print (matrix [a] [b] +"");         
        }
            System.out.println ();
        }
        
    }
    
}
