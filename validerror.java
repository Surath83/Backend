import java.util.*;
public class validerror {
    static void fun(int index,int [] marks)throws Exception {
        if(index>3){
            throw new Exception("ERROR");
        }
        System.out.println("The value of marks[ind] is : "+ marks[index]);
        return;
    }
    public static void main(String[] args) {
        boolean flag=true;
        int [] marks = new int[3];
        marks[0]=7;
        marks[1]=56;
        marks[2]=6;
        Scanner sc = new Scanner(System.in);
        int index;
        int i=0;
        while(flag && i<5){
            try{
                System.out.println("Enter the value of index:");
                index = sc.nextInt();
                fun(index,marks);
                break;
            }
            catch(Exception e){
                System.out.println("Invalid index!");
                i++;
            }
        }
        sc.close();
    }
}
