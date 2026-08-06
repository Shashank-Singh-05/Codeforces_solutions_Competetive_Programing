import java.util.Scanner;

public class A732 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int k = sc.nextInt();
        int r = sc.nextInt();

        int i = 1;
        while (true) {
            int lastDigit = (k * i) % 10;

            if (lastDigit == 0 || lastDigit == r) {
                System.out.println(i);
                break;
            }
            i++;
        }
    }
}