import java.util.*;

public class A144 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] a = new int[n];

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        int maxIndex = 0;
        int minIndex = 0;

        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();

            if (a[i] > max) {
                max = a[i];
                maxIndex = i;
            }

            if (a[i] <= min) {
                min = a[i];
                minIndex = i;
            }
        }

        int ans = maxIndex + (n - 1 - minIndex);

        if (maxIndex > minIndex) {
            ans--;
        }

        System.out.println(ans);
    }
}