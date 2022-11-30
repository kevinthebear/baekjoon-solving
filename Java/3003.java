import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int king = in.nextInt();
        int queen = in.nextInt();
        int rook = in.nextInt();
        int bishop = in.nextInt();
        int knight = in.nextInt();
        int pawn = in.nextInt();
        
        System.out.println(1-king);
        System.out.println(1-queen);
        System.out.println(2-rook);
        System.out.println(2-bishop);
        System.out.println(2-knight);
        System.out.println(8-pawn);
    }
}
