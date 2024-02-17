import java.util.HashSet;
public class setdublicate {
    public static void main(String[] args) {
        HashSet<Integer> h = new HashSet<>(6,0.5f);
        h.add(2);
        h.add(5);
        h.add(9);
        h.add(1);
        h.add(2);
        h.add(9);
        System.out.println(h);

    }
}
