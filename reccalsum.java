import java.util.*;
public class reccalsum {
    public static int sum(int n){
        if(n==0){
            return 0;
        }
        return n+sum(n-1);
    }
    public static void main(String Args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a no.: ");
        int n = sc.nextInt();
        System.out.println("The sum is: "+sum(n));
        sc.close();
    }
}
