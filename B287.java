import java.util.*;

public class B287 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        long n = sc.nextLong();
        long k = sc.nextLong();

        if (n == 1) {
            System.out.println(0);
            return;
        }

        if (k == 1) {
            System.out.println(-1);
            return;
        }

        long maxPipes = 1 + k * (k - 1) / 2;

        if (maxPipes < n) {
            System.out.println(-1);
            return;
        }

        long low = 1;
        long high = k - 1;
        long ans = k - 1;

        while (low <= high) {
            long mid = (low + high) / 2;

            long increase = (k - 1 + (k - mid)) * mid / 2;
            long pipes = 1 + increase;

            if (pipes >= n) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }
        System.out.println(ans);
    }
}