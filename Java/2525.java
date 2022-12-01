import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int H = in.nextInt();
        int M = in.nextInt();
        int cook_M = in.nextInt();
        
        H += (M + cook_M)/60;
        M = (M + cook_M)%60;
        
        if (H > 23){
            H -= 24;
        }
        System.out.println(H + " " + M);
    }
}
