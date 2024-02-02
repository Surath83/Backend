package surath;
import java.util.*;
public class library {
    public static char abook[]={'a', 'b', 'c', 'd', 'e'};
    public static char ibook[];
    public static char rbook[];
    public static void issueBook(char book){
        for(int i=0 ; i<abook.length; i++){
            if(book==abook[i]){
                System.out.println("Book "+book+" is issued!");

                return;
            }
        }
        System.out.println("Book is not present!(not issued)");
        return;
    }

    public static void returnBook(char book){

        System.out.println("The book "+book+" is returned!");
        return;

    }

    public static void showAvailableBook(){
        for(int i=0;i<abook.length;i++){
            System.out.print(abook[i]+" ");
            }
            System.out.println();
            return;
    }
    public static char book(){
        Scanner b = new Scanner(System.in);
            return b.next().charAt(0);
        
    }

    public static void main (String[] args){
        Scanner sc = new Scanner(System.in);
    while(true){
        System.out.println("1. To issue a book");
        System.out.println("2. To return a book");
        System.out.println("3. To show the available books");
        System.out.print("Enetr the choice:");
        
        int ch = sc.nextInt();
        switch(ch){
                    
            case 1:System.out.print("Enter the name of the book(a-e):");
                    issueBook(book());
                    break;
            case 2:System.out.print("Enter the name of the book to return:");
                    returnBook(book());
                    break;
            case 3: showAvailableBook();
                    break;
            default: System.out.println("plz enter a valid character!");
                    break;
        }
    }
    }
}
