import java.util.*;

public class stupassfail {

    static class Info {

        String name;
        int sub1;
        int sub2;
        int sub3;

        public int getmark(int i) {
            if (i == 1) {
                return sub1;
            }
            if (i == 2) {
                return sub2;
            }
            if (i == 3) {
                return sub3;
            }
            return 0;
        }

        public Info() {
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the Student:");
            name = sc.nextLine();

            System.out.println("Enter the marks of 3 subjects out of 100:");

            sub1 = sc.nextInt();
            sub2 = sc.nextInt();
            sub3 = sc.nextInt();

            sc.close();
        }
    }

    public static void main(String Args[]) {
        Info s1 = new Info();

        int marks = 0;
        int pass = 0;
        int fail = 0;
        for (int i = 1; i <= 3; i++) {
            marks += s1.getmark(i);
            if (s1.getmark(i) >= 33) {
                pass++;
            } else {
                fail++;
            }
        }
        if (pass == 3) {
            System.out.println("The student is passed in all the subjects with a total of " + marks + " marks.");
        } else {
            System.out.println("The student is failed in " + fail + " subjects with a total of " + marks + " marks.");
        }

    }
}
