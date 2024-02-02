public class abspen {
    public static abstract class pen{
        abstract void write();
        abstract void refill();
    }
    public static class p1 extends pen{
        p1(){
            System.out.println("Pen class is called!");
        }
        void write(){
            System.out.println("Righting completed with pen");
        }
        void refill(){
            System.out.println("Refilling completed the pen");
        }
    }
    public static class fop2 extends pen{
        void write(){
            System.out.println("Righting completed with fountain pen");
        }
        void refill(){
            System.out.println("Refilling completed in fountain pen");
        }
        void changeNib(){
            System.out.println("Nib of fountain pen is changed");
        }
    }
    public static void main (String Args []){
        p1 pen1 = new p1();
        pen1.write();
        pen1.refill();
        fop2 pen2 = new fop2();
        pen2.write();
        pen2.refill();
        pen2.changeNib();
    }
}
