import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int X = in.nextInt();
        int N = in.nextInt();
        int price = 0;
        
        for(int i = 1; i <= N; i++){
            int a = in.nextInt();
            int b = in.nextInt();
            price += a * b;
        }
        
        if(price == X){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
    }
}
