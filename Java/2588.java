import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        
        int A = in.nextInt();
        int B = in.nextInt();
        int B_one = B%10;
        int B_ten = (B%100 - B_one)/10;
        int B_hundred = (B-(B%100 - B_one))/100;

        System.out.println(A*B_one);
        System.out.println(A*B_ten);
        System.out.println(A*B_hundred);
        System.out.println(A*B);
    }
}
