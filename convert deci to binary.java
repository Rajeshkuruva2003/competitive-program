import java.util.*;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        StringBuilder res = new StringBuilder();

        while (x != 0) {
            if (x % 2 == 1) {
                res.append('1');
            } else {
                res.append('0');
            }
            x = x / 2;
        }

        res.reverse();

        System.out.println("Binary format: " + res.toString());
    }
}