package surath;

import java.util.*;

public class rockpaper {
    public static int game(int ch, int r) {
        if ((ch == 1 && r == 3) || (ch == 2 && r == 1) || (ch == 3 && r == 2)) {
            return 1; // Player wins
        } else if ((ch == 1 && r == 2) || (ch == 2 && r == 3) || (ch == 3 && r == 1)) {
            return 2; // Computer wins
        } else {
            return 0; // It's a draw
        }
    }

    public static void result(int i) {
        if (i == 1) {
            System.out.println("You won.");
        } else if (i == 2) {
            System.out.println("You lose.");
        } else {
            System.out.println("It's a draw.");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (true) {
            Random rn = new Random();
            int r = rn.nextInt(3) + 1;
            System.out.println("RockPaperScissors Game:");
            System.out.println("1 => Rock");
            System.out.println("2 => Paper");
            System.out.println("3 => Scissors");
            System.out.print("Enter your choice: ");

            int ch = sc.nextInt();
            System.out.println();
            if (ch >= 1 && ch <= 3) {
                result(game(ch, r));
            } else {
                System.out.println("Enter a valid input.");
            }

            System.out.println("Try again!");
        }
    }
}
