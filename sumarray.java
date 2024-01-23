public class sumarray {
    public static void main(String[] args){
        float a[]= { 1.0f,45.34f,56.56f,23.43f,5.6f};
        float sum=0.0f;
        for (int i=0; i<a.length; i++){
            sum+=a[i];
        }
        System.out.println("The sum of all the elements in the array is: "+sum);
    }
}
