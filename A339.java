import java.util.*;

public class A339 {

    
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        String s = sc.next();

        ArrayList<Character> list = new ArrayList<>();

        for (char c : s.toCharArray()) {
            if (c != '+')
                list.add(c);
        }

        Collections.sort(list);

        for (int i = 0; i < list.size(); i++) {
            System.out.print(list.get(i));
            if (i != list.size() - 1)
                System.out.print("+");
        }
    }
}