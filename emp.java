import java.util.*;
public class emp {
    public static class employee{
        String name;
        int salary;
        public employee(){
            name=setName();
            salary=12000;
        }
        
        public String setName(){
            Scanner sc = new Scanner(System.in);
            System.out.print("Enter the name of the employee :");
            String name=sc.nextLine();
            sc.close();
            return name;
            }
        public int getSalary(){
            return salary;
        }
        public String getName(){
            return name;
        }

    }
    
    public static String getName(){
    Scanner sc = new Scanner(System.in);
    System.out.print("Enter the name of the employee :");
    String name=sc.nextLine();
    sc.close();
    return name;
    }

    public static void main(String[] args) {
        employee em = new employee();

        System.out.println("The name of the employee is: "+em.getName());
        System.out.println("The salary of the employee is: "+em.getSalary());
    }
}
