public class error{
    public static void main(String[] args) {
        try{
            int a=66/0;
        }
        catch(IllegalArgumentException e){
            System.out.println("hehe");
        }
        catch(ArithmeticException e){
            System.out.println("haha");
        }
    }
}