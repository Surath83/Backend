import java.util.*;
public class noguss {
    public static void number(int a){
        Scanner sc = new Scanner(System.in);
        while(true){
            
        System.out.println("Enter a no.:");
        int b = sc.nextInt();
        if(a==b){
            System.out.println("The user and given no. are same");
            System.out.println("you won!");
            return;
        }else if(a>b){
            System.out.println("The user no. is smaller than the given no.");
            System.out.println("you loss!");
            
        }else{
            System.out.println("The user no. is greater than the given");
            System.out.println("you loss!");
            
        }
        }
    } 
    public static void main(String[] args){
        System.out.println("Gussing Game:");
        int a = 53;
        number(a);        
    }
}
