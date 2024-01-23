import java.util.Scanner;
public class searcharray {
    public static void main (String[] args){
        try (Scanner sc = new Scanner(System.in)) {
            int a[]={3,4,76,80,57,68,90,45};
            System.out.print("Enter a no.: ");
            int key= sc.nextInt();
            for(int i=0;i<a.length;i++){
                if(key==a[i]){
                    i++;
                    System.out.println("The entered no. is present in the array at index "+i);
                    return;
                }
            }
            System.out.println("The entered no. is not present in the array");
            sc.close();
        }
    }
}
