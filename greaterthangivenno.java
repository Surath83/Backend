import java.util.*;
public class greaterthangivenno {
    public static void main (String[] args) {
        int a = 50;
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int b = sc.nextInt();
        if(a>b){
            System.out.println("The given value is greater than the user value.");
        }else{
            System.out.println("The given value is lesser than the user value.");
        }
        sc.close();
    }
}
