import java.util.*;

public class encreptedinput {
    public static int setvalue() {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.:");
        int a = sc.nextInt();
        int b = a + 8;
        sc.close();
        return b;
    }

    public static int getvalue(int a) {
        int b = a - 8;
        return b;
    }

    public static void main(String[] args) {
        int a = setvalue();
        System.out.println("The actual decrepted value is: " + getvalue(a));
    }
}