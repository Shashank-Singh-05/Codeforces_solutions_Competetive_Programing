import java.util.*;

public class B1266 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int t = sc.nextInt();

        while (t-- > 0) {
            long x = sc.nextLong();

            long rem = x % 14;

            if (x > 14 && rem >= 1 && rem <= 6)
                System.out.println("YES");
            else
                System.out.println("NO");
        }
    }
}
