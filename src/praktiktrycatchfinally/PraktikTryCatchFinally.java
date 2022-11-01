
package praktiktrycatchfinally;

import java.util.Scanner;

public class PraktikTryCatchFinally {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Masukkan angka pembagi untuk angka 8: ");
        try {
            int angka = input.nextInt();
            int hasil = 8 / angka;

            System.out.println(hasil);

        } catch (ArithmeticException ex) {
            System.out.println("Tidak Boleh Menggunakan Pembagian dengan 0 (nol)");
            System.out.println(ex);
        } finally {

            System.out.println("Program Diakhiri");
        }
        System.out.println("-------- TERIMA KASIH TELAH MENJALANKAN PROGRAM --------");
    }
}
