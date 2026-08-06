import java.util.Scanner;

public class A1374 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long n = sc.nextLong();

            long ans = n - (n % x) + y;

            if (ans > n)
                ans -= x;

            System.out.println(ans);
        }
    }
}