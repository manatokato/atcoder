package AtCoderBeginnersSelection;
import java.util.Scanner;

public class ABC085C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
    
        int N = sc.nextInt();
        int Y = sc.nextInt();

        for (int x = 0; x <= N; x++) {
            for (int y = 0; x + y <= N; y++){
                int z = N - x - y;
                if (z < 0) continue;

                int sum = 10000 * x + 5000 * y + 1000 * z;

                if (Y == sum){
                    System.out.println(x + " " + y + " " + z);
                    return;
                }
            }
        }
        System.out.println("-1 -1 -1");
    }

}