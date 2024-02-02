package surath;

public class cal {
    public static class Calculator{
        Calculator(){
            System.out.print("Claculator -> ");
        }
    }
    public static class ScCalculator extends Calculator{
        ScCalculator(){
            System.out.print("ScClaculator -> ");
        }
    }
    public static class HybridCalculator extends ScCalculator{
        HybridCalculator(){
            System.out.print("HybridClaculator -> ");
        }
    }


    public static void main(String[] args){
        Calculator c = new Calculator();
        System.out.println();
        ScCalculator sc = new ScCalculator();
        System.out.println();
        HybridCalculator hc = new HybridCalculator();
        
    }
}
