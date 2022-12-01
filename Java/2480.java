import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        int prize;
        
        if (A == B && B == C){
            prize = 10000 + A * 1000;
        }
        else if (A == B || A == C){
            prize = 1000 + A * 100;
        }
        else if (B == C){
            prize = 1000 + B * 100;
        }
        else {
            prize = Math.max(Math.max(A,B),C) * 100;
        }
        System.out.println(prize);
    }
}
