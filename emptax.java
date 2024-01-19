import java.util.*;

public class emptax {

    static class Employee {
        String name;
        float sal;

        public Employee() {
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter the name of the employee:");
            name = sc.next();
            System.out.println("Enter the annual income:");
            sal = sc.nextFloat();
            sc.close();
        }
    }

    public static void main(String Args[]) {
        Employee e1 = new Employee();

        float intax = 0;
        if (e1.sal < 2.5) {
            intax = 0;
        } else if (e1.sal >= 2.5 && e1.sal < 5.0) {
            intax = e1.sal * 5 / 100;
        } else if (e1.sal >= 5.0 && e1.sal < 10.0) {
            intax = e1.sal * 20 / 100;
        } else {
            intax = e1.sal * 30 / 100;
        }

        System.out.println("The income tax which has to be paid is " + intax);
    }
}
