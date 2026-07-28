import java.util.*;

public class burger {

    static long cb, cs, cc;
    static long nb, ns, nc;
    static long pb, ps, pc;
    static long r;

    static boolean canMake(long x) {
        long needB = Math.max(0, x * cb - nb);
        long needS = Math.max(0, x * cs - ns);
        long needC = Math.max(0, x * cc - nc);

        long cost = needB * pb + needS * ps + needC * pc;

        return cost <= r;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String recipe = sc.next();

        for (char ch : recipe.toCharArray()) {
            if (ch == 'B') cb++;
            else if (ch == 'S') cs++;
            else cc++;
        }

        nb = sc.nextLong();
        ns = sc.nextLong();
        nc = sc.nextLong();

        pb = sc.nextLong();
        ps = sc.nextLong();
        pc = sc.nextLong();

        r = sc.nextLong();

        long low = 0;
        long high = (long)1e13;
        long ans = 0;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            if (canMake(mid)) {
                ans = mid;
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        System.out.println(ans);
    }
}