package latihana1;

public class LatihanA1 {

    public static void main(String[] args) {
        int a[][] = {{-7, 5}, {4, 8}};
        int b[][] = {{1, 1}, {-4, 9}};
        System.out.println("Hasil A-B");
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                System.out.print(a[i][j] - b[i][j] + "\t");
            }
            System.out.println();
        }
    }

}
