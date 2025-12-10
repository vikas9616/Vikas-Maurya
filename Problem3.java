import java.util.Scanner;

public class Problem3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int a = sc.nextInt();

        int limit;
        if (a % 2 == 0) {
            limit = a - 1;
        } else {
            limit = a;
        }

        for (int i = 0; i <= limit / 2; i++) {
            System.out.print((2 * i + 1));
            if (i < limit / 2) {
                System.out.print(", ");
            }
        }

        sc.close();
    }
}
