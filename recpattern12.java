import java.util.*;

public class recpattern12 {

    public static void pattern(int n) {
        if (n == 0) {
            return;
        }
        for (int i = 0; i < n; i++) {
            System.out.print("*");
        }
        System.out.println();

        pattern(n - 1);
    }

    public static void main(String main[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
        pattern(n);
        sc.close();
    }
}