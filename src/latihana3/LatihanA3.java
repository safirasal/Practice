package latihana3;

public class LatihanA3 {

    public static void main(String[] args) {
        int a[][] = {{6, 3, 2}, {4, 2, 3}};
        int b[][] = {{1, 2}, {2, 3}, {3, 1}};
        int h[][] = {{0, 0}, {0, 0}};
        System.out.println("Hasil AxB");
        //proses perhitungan
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 3; k++) {
                    h[i][j] = h[i][j] + a[i][k] * b[k][j];
                }
            }
        }
        //menampilkan hasil
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(h[i][j] + "\t");
            }
            System.out.println();
        }

    }
}
