import java.util.*;
public class shape{
    public static class Square{
        int side;
        public Square(int data){
            this.side=data;
        }
    }
    public static int area(int data){
        return data*data;
    }
    public static int perimeter(int data){
        return 4*data;
    }
    public static void main(String Args []){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the length of each side of a square :");
        Square sq = new Square(sc.nextInt());
        System.out.println("The area is: "+area(sq.side));
        System.out.println("The perimeter is: "+perimeter(sq.side));
        sc.close();
    }
}