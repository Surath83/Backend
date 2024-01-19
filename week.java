import  java.util.*;
public class week {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no. between 1 to 7 :");
        int num = sc.nextInt();
        switch (num){
            case 1: System.out.println("Its monday.");
                    break;
            case 2: System.out.println("Its tuesday.");
                    break;
            case 3: System.out.println("Its wednessday.");
                    break;
            case 4: System.out.println("Its thusday.");
                    break;
            case 5: System.out.println("Its friday.");
                    break;
            case 6: System.out.println("Its saturday.");
                    break;
            case 7: System.out.println("Its sunday.");
                    break;
            default: System.out.println("Invalid input");
                    break;

        }
        sc.close();
    }
}
