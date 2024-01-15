import java.util.*;
public class covKmM {
    public static void main(String Args[]){
        Scanner sc= new Scanner(System.in);
        System.out.print("enter the distance in 'KM' :");
        float a = sc.nextFloat();
        float b = (float) 0.621371;
        float x = a*b;
        System.out.println("The same distance in 'miles' willbe :"+x);
        sc.close();
    }
}
