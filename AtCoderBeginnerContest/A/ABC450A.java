package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC450A {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int S = sc.nextInt();

        while (S > 0) {
            System.out.print(S);
            S--;
            if (S != 0) {
                System.out.print(",");
            }
        }
    }
}