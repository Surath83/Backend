import java.util.*;
public class sumeven {
    public static boolean iseven(int i){
        if(i%2==0){
            return true;
        }else{
            return false;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number:");
        int n = sc.nextInt();
        int sum = 0;
        int i=0;
        while (i <= n) {
            if(iseven(i)){
                sum+=i;
            }
            i++;   
        }
        System.out.println("The sum of all the even no. is "+sum);
        sc.close();
    }
}
