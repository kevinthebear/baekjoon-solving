import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int H = in.nextInt();
        int M = in.nextInt();
        int new_H;
        int new_M;
        
        if (M >= 45) {
            new_H = H;
            new_M = M - 45;
        }
        else if (H > 0){
            new_H = H - 1;
            new_M = 60 + (M - 45);           
        }
        else {
            new_H = 23;
            new_M = 60 + (M - 45);      
        } 
        System.out.println(new_H + " " + new_M);
    }
}
