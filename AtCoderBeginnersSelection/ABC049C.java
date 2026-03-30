package AtCoderBeginnersSelection;

import java.util.Scanner;

public class ABC049C {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // 「dream dreamer erase eraser」の文字列を逆にする
        String[] divide = { "dream", "dreamer", "erase", "eraser" };
        for (int i = 0; i < divide.length; i++) {
            divide[i] = new StringBuilder(divide[i]).reverse().toString();
        }

        // 入力された文字列を逆にする
        String S = sc.next();
        S = new StringBuilder(S).reverse().toString();

        boolean can = true;

        // iはチェック中の位置（0から始まって一致するたびに進む）
        for (int i = 0; i < S.length();) {
            boolean can2 = false; // 今の位置で一致する単語が見つかったか

            for (int j = 0; j < divide.length; j++) {
                String d = divide[j];

                // iの位置からd.length()文字切り出してdと比較
                // Math.minで入力値の末桁を指定
                if (S.substring(i, Math.min(i + d.length(), S.length())).equals(d)) {
                    can2 = true;

                    i += d.length(); // 例) i=0 → i=6（resareの6文字分進む）
                    break; // 次の単語を確認次の単語を確認
                }
            }

            // 4つの単語どれにも一致しなかった場合
            if (!can2) {
                can = false;
                // 処理の終了
                break;
            }
        }

        // canがtrueであれば"YES"を出力
        System.out.println(can ? "YES" : "NO");
    }
}
