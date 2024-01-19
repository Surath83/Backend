import java.util.*;
public class pattern1 {
    public static void main(String Args[]){
        Scanner sc = new Scanner (System.in);
        System.out.print("Enetr a number:");
        int n = sc.nextInt();
        for(int i=n;i>0;i--) {
            for(int j=0;j<i;j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        sc.close();
    }
}
