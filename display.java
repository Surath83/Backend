package surath;

import java.util.Scanner;
import surath.buil.Built;

public class display {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a string: ");
        String str = sc.next();
        Built b = new Built();
        b.call(str);
    }
}
