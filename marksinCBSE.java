package surath[tasks];

import java.util.*;

public class marksinCBSE {
    static class Info {

        String name;
        int sub1;
        int sub2;
        int sub3;
        int sub4;
        int sub5;

        public Info() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the Student:");
            name = sc.nextLine();

            System.out.println("Enter the marks of 5 subjects out of 100:");

            sub1 = sc.nextInt();
            sub2 = sc.nextInt();
            sub3 = sc.nextInt();
            sub4 = sc.nextInt();
            sub5 = sc.nextInt();

            sc.close();
        }
    }

    public static void main(String Args[]) {
        Info s1 = new Info();

        int marks = (s1.sub1 + s1.sub2 + s1.sub3 + s1.sub4 + s1.sub5) / 5;

        System.out.println("The marks of the " + s1.name + " is " + marks + "%.");
    }
}
