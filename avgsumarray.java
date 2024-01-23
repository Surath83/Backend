public class avgsumarray {
    public static void main(String[] args){
        int s[]={1,2,3};
        int sum=0;
        int avg=0;
        for (int i : s) {
            sum+=i;
        }
        avg=sum/s.length;
        System.out.println("The average marks is: "+avg);
    }
}
