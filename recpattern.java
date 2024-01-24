import java.util.*;
public class recpattern {
    static int count = 1;
    public static void pattern(int n){
        if(count>n){
            return;
        }
        for(int i=0; i<count; i++){
            System.out.print("*");
        }
        System.out.println();
        count++;
        pattern(n);
    }
    public static void main(String main []){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no.: ");
        int n=sc.nextInt();
        pattern(n);
        sc.close();
    }
}
