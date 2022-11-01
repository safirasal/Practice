package praktikkeywordthrows;

import java.util.Scanner;

public class PraktikKeywordThrows {

    public static void nilai(int x)
            throws NullPointerException, java.lang.ArithmeticException {
        if (x < 0) {
            throw new NullPointerException(
                    "Kesalahan terjadi pada null pointer");
        } else {
            throw new java.lang.ArithmeticException(
                    "Kesalahan terjadi pada arithmetic exception");

        }
    }

    public static void main(String[] args) {
        Scanner console = new Scanner(System.in);
        System.out.println("Masukkan kode angka: ");
        try {
            int c = console.nextInt();
            nilai(c);
            System.out.println(" The result is " + c);

        } catch (java.lang.ArithmeticException | NullPointerException e) {
            System.out.println("Telah terjadi kesalahan pada kode");
            System.out.println(e.getMessage());

        }
        System.out.println("Kode tidak valid");
    }
}
