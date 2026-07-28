import java.util.*;

public class chewbacca {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] num = sc.next().toCharArray();

        for (int i = 0; i < num.length; i++) {
            int d = num[i] - '0';

            if (i == 0 && d == 9)
                continue;

            if (d > 4)
                num[i] = (char) ('0' + (9 - d));
        }

        System.out.println(new String(num));
    }
}