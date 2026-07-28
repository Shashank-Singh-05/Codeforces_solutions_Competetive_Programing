import java.util.*;

public class tozero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();
            long y = sc.nextLong();
            long a = sc.nextLong();
            long b = sc.nextLong();

            long ans = 0;
            if (b >= 2 * a) {
                ans = (x + y) * a;
            } else {
                long common = Math.min(x, y);
                long diff = Math.abs(x - y);
                ans = common * b + diff * a;
            }
            System.out.println(ans);
        }
        sc.close();
    }
}