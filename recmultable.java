import java.util.*;

public class recmultable{
    static int count=1;
    public static void recmul(int n){
        if(count>10){
            return;
        }
        System.out.println(n+"*"+count+"="+n*count);
        count++;
        recmul(n);
    }
    public static void main(String[]Args){
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a no.: ");
        int n= sc.nextInt();
        recmul(n);
        sc.close();
    }
}