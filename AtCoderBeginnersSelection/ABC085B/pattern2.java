package AtCoderBeginnersSelection.ABC085B;
import java.util.Scanner;

public class pattern2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        // バケット（各値が何個あるかを管理する配列）
        int[] num = new int[101]; // 1 <= d[i] <= 100 なので101個確保

        for (int i = 0; i < n; i++) {
            num[d[i]]++; // d[i]の個数を増やす
        }

        int res = 0;
        for (int i = 1; i <= 100; i++) {
            if (num[i] > 0) { // 1個以上あれば種類数をカウント
                res++;
            }
        }

        System.out.println(res);
    }
}