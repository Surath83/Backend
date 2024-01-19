public class summul8 {
    public static void main(String[] args){
        int num = 8;
        int sum=0;
        for(int i=1;i<=10;i++){
            System.out.println(i+"*"+num+"="+(i*num));
            sum+=(i*num);
        }
        System.out.println("The sum is "+sum);
    }
}

