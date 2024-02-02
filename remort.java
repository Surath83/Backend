public class remort {
    interface TvRemote{
        void nextchannel();
        void previouschannel();
    }
    public static class Tv implements TvRemote{
        Tv(){
            System.out.println("Tv class is called!");
        }
        public void nextchannel() {
            System.out.println("Next channel is showing!");
        }
        public void previouschannel() {
            System.out.println("Previous channel is showing!");
        }
    }
    public static class SmartRemort implements TvRemote{
        SmartRemort() {
            System.out.println("SmartRemort class is called!");
        }
        public void nextchannel() {
            System.out.println("Next channel is showing!");
        }
        public void previouschannel() {
            System.out.println("Previous channel is showing!");
        }

    }
    public static void main(String[] args) {
        SmartRemort sr = new SmartRemort();

        sr.nextchannel();
        sr.previouschannel();

        Tv tv = new Tv();

        tv.nextchannel();
        tv.previouschannel();
    
    }
}
