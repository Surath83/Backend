import java.util.*;

public class checkint {
    public static boolean istrue(String str){
        boolean found= false;
        for (int i = 0; i < str.length(); i++) {
            for (int j = 0; j <= 9; j++) {
                if ((int)str.charAt(i) == (int) j) {
                    found = true;
                } else {
                    return found = false;
                }
            }
        }
        return found;
    }
    public static void main(String Args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Give some input :");
        String str = sc.nextLine();
        boolean found = istrue(str);
        
        if (found) {
            System.out.println("the given input is an integer.");
        } else {
            System.out.println("the given input is not an integer");
        }
        sc.close();
    }
}
