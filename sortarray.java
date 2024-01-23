public class sortarray {
    public static void main(String Args[]) {
        int a[] = { 0,1,2,3,576,5,6,7,8 };
        int min = a[0];
        for (int i = 1; i < a.length; i++) {
            if(min<a[i]){
                min=a[i];
            }
            if(min>a[i]){
                System.out.println("The array is not sortted");
                return;
            }
        }
        System.out.println("The array is sortted");
    }
}
