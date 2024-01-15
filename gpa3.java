import java.util.*;

public class gpa3 {
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enetr the marks out of 100");
        System.out.print("Maths:");
        int maths = sc.nextInt();
        System.out.print("Physics:");
        int phy = sc.nextInt();
        System.out.print("Computer:");
        int comp = sc.nextInt();
        float marks = (maths + phy + comp) / 30;
        System.out.println("The GPA is:" + marks);
        sc.close();
    }
}
