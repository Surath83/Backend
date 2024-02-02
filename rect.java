import java.util.*;

public class rect {
    public static class Rectangle{
        int length;
        int breadth;
        Rectangle(){
            length = breadth = 0;
        }
    }
        public static class Cuboid{
            static int length;
            Cuboid(){
                Scanner sc = new Scanner(System.in);
                this.length=sc.nextInt();
            }
            public int area(){
                return length*length;

            }
            public int volume(){
                return length*length*length;
            }
        }
    
    public static void main(String Args[]){
        System.out.print("Enter the length of a cubiod:");
        
        Cuboid cu = new Cuboid();
        System.out.println("The area of the cuboid is :"+cu.area());
        System.out.println("The volume of the cuboid is :"+cu.volume());

    }
}
