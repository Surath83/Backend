public class call {
    public static abstract class Telephone{
        Telephone(){
            System.out.println("Telephone class is called!");
        }
        abstract void ring();
        abstract void lift();
        abstract void disconnect();
    }
    public static class Smartphone extends Telephone{
        Smartphone(){
            System.out.println("Smartphone class is called!");
        }
        public void ring(){
            System.out.println("Phone is ringing!");
        }
        public void lift(){
            System.out.println("phone is lifted!");
        }
        public void disconnect(){
            System.out.println("phone is disconnected!");
        }
    }
    public static void main(String[] args) {
        Smartphone sp = new Smartphone();

        sp.ring();
        sp.lift();
        sp.disconnect();
    }
}
