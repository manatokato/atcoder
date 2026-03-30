package AtCoderBeginnersSelection;
import java.util.Scanner;

public class ABC086C {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // チェックポイントの数
        int N = sc.nextInt();

        // 0番目はスタート地点(時刻0, x=0, y=0)
        // Javaは配列を作ると自動で0初期化されるので明示的に書かなくてOK
        int[] t = new int[N + 1];
        int[] x = new int[N + 1];
        int[] y = new int[N + 1];

        // 1番目からN番目にチェックポイントを格納
        for (int i = 0; i < N; i++) {
            t[i + 1] = sc.nextInt(); // 時刻
            x[i + 1] = sc.nextInt(); // x座標
            y[i + 1] = sc.nextInt(); // y座標
        }

        boolean can = true;

        for (int i = 0; i < N; i++) {
            // 前の地点から今の地点までの時間
            int dt = t[i + 1] - t[i];

            // 前の地点から今の地点までの距離（縦の差 + 横の差）
            int dist = Math.abs(x[i + 1] - x[i]) + Math.abs(y[i + 1] - y[i]);

            // 条件1: 時間内に距離が届かない
            // 例) dt=3, dist=5 → 3秒で5マスは無理
            if (dt < dist) {
                can = false;
                break;
            }

            // 条件2: dtとdistの偶奇が違う（余った時間で帳尻が合わない）
            // 例) dt=3(奇数), dist=2(偶数) → 余り1秒で元の場所に戻れない
            if (dist % 2 != dt % 2) {
                can = false;
                break;
            }
        }

        // 全チェックポイントをクリアできたか
        System.out.println(can ? "Yes" : "No");
    }
}