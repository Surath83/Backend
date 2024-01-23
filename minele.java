public class minele {
    public static void main(String Args[]){
        int min = Integer.MAX_VALUE;
        int a[]={12,45,67,34,89,-22,-56,-54};
        for(int i=0; i<a.length; i++){
            if(min>=a[i]){
                min=a[i];
            }
        }
        System.out.println("The minimum element present in the array is: "+min);
    }
}
