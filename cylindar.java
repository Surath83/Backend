import java.util.*;

public class cylindar{

    public static class shape{
        public double length;
        public double breadth;
        shape(){
            System.out.println("Shape class is called");
        }
    }

    public static class rectangle extends shape{
        rectangle(){
            System.out.println("Rectangle class is called");
            System.out.println("Enter the length :");
            length = set();
            System.out.println("Enter the breadth :");
            breadth = set();
        }

        public double set(){
            Scanner sc = new Scanner(System.in);
            return sc.nextDouble();
        }

        public double area(double length,double breadth) {
            return length*breadth;
        }

        public double perimeter(double length,double breadth) {
            return 2*(length*breadth);
        }

    }

    public static class sphere extends shape{
        double radius;
        sphere(){
            System.out.println("the sphere class is called");
            System.out.println("Enter the radius:");
            radius = set();
        }

        public double set(){
            Scanner sc = new Scanner (System.in);
            return sc.nextDouble();
        }

        public double area(){
            return 4*3.14*radius*radius;
        }

        public double volume(){
            return 4/3*3.14*radius*radius*radius;
        }
    }

    public static class cylinder extends shape{
        double radius;
        double height;
        public cylinder(){
            radius= setradius();
            height= setheight();
        }
    
        

    public double getradius(){
        return radius;
    }

    public double getheight(){
        return height;
    }

    public double setradius(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the radius:");
        return sc.nextDouble();
    }

    
    public double setheight(){
        Scanner sc  = new Scanner(System.in);

        System.out.println("Enter the height:");
        return sc.nextDouble();
    }
}

    public static void main(String[] args) {
        cylinder c = new cylinder();

        double a=c.getradius();
        double b=c.getheight();
        double v = 3.14*a*b*a;
        double sa = 2*3.14*a*a+2*3.14*a*b;

        System.out.println("the surface area is "+sa);

        System.out.println("the volume of the cylinder is " +v );

        System.out.println();
        System.out.println();

        rectangle r = new rectangle();

        System.out.println("The area of the rectangle is: "+ r.area(r.length,r.breadth));

        System.out.println("The perimeter of the rectangle is :"+ r.perimeter(r.length,r.breadth));

        System.out.println();
        System.out.println();

        sphere s = new sphere();

        System.out.println("The area of the sphere is :"+s.area());

        System.out.println("The volume of the sphere is :"+s.volume());
    }
}