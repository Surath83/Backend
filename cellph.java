public class cellph {
    public static class CellPhone{
        String model;
        int price;
        CellPhone(){
            model= "Iphone";
            price=60000;
        }
    
    public void ringing(){
        System.out.println("The phone is ringing");
    }
    public void vibrating(){
        System.out.println("The phone is vibrating");
    }
}
    public static void main(String Args[]){
        CellPhone cp = new CellPhone();

        cp.ringing();
        cp.vibrating();
    }
    
}
