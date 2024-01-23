public class reversearray {
 public static void main(String Args[]){
    int a[]={5,8,3,9,1,6,0};
    int b[]=new int[a.length];
    for(int i=0; i<a.length; i++){
        b[a.length-1-i]=a[i];
    }
    for(int i=0; i<b.length; i++){
        System.out.print(b[i]+" ");
    }
    System.out.println();   
}
}
