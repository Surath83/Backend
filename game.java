public class game {
    public static class RockStar{
        public RockStar(){
            System.out.print("The rockStar game presents ->");
        }
    }
    public static class TommyVecetti extends RockStar{
        public TommyVecetti(){
        System.out.print("TommyVecetti");
        System.out.println();
    }
    public void running(){
        System.out.println("Tommy is running");
    }
    public void fireing(){
        System.out.println("Tommy is firing");
    }
    }

    public static void main (String Args []){
        TommyVecetti tv = new TommyVecetti();
        tv.running();
        tv.fireing();

    }
    
}
