import java.util.Scanner;

public class parklight {
    public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while (t-- > 0) {
            long n = sc.nextLong();
            long m = sc.nextLong();

            long ans = (n * m + 1) / 2;
            System.out.println(ans);
        }
        
        sc.close();
    }
}