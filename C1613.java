import java.util.*;

public class C1613 {
    static boolean possible(long[] a, long k, long h) {
        long damage = 0;

        for (int i = 0; i < a.length - 1; i++) {
            damage += Math.min(k, a[i + 1] - a[i]);
        }

        damage += k;

        return damage >= h;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            int n = sc.nextInt();
            long h = sc.nextLong();

            long[] a = new long[n];

            for (int i = 0; i < n; i++) {
                a[i] = sc.nextLong();
            }

            long low = 1;
            long high = h;
            long ans = h;

            while (low <= high) {
                long mid = (low + high) / 2;

                if (possible(a, mid, h)) {
                    ans = mid;
                    high = mid - 1;
                } else {
                    low = mid + 1;
                }
            }
            System.out.println(ans);
        }
    }
}