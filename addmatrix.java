
public class addmatrix {
    public static void main(String[] args) {

        int a[][] = { { 1, 2, 3 }, { 4, 5, 6 } };
        int b[][] = { { 9, 8, 7 }, { 6, 5, 4 } };
        int c[][] = { { 0, 0, 0 }, { 0, 0, 0 } };

        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                c[i][j] = a[i][j] + b[i][j];
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(c[i][j] + " ");
            }
            System.out.println();
        }
    }
}