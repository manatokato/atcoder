package AtCoderBeginnersSelection;
import java.util.Scanner;

public class ABC081B {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int a[] = new int[n];

        int count = 0;
        
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        
        while (true) {
            boolean flg = true;

            for (int i = 0; i < n; i++) {
                if (a[i] % 2 != 0) {
                    flg = false;
                    break;
                }
            } 

            if (!flg) {
                break;
            }

            if (flg) {
                for (int i = 0; i < n; i++) {
                    a[i] = a[i] / 2;
                }
            }
            count++;
        }
        System.out.println(count);
    }
}
