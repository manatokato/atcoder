package AtCoderBeginnersSelection.ABC085B;
import java.util.Scanner;
import java.util.HashSet;
import java.util.Set;

public class pattern3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int[] d = new int[n];

        for (int i = 0; i < n; i++) {
            d[i] = sc.nextInt();
        }

        // Setに追加（重複は自動で無視される）
        Set<Integer> values = new HashSet<>();

        for (int i = 0; i < n; i++) {
            values.add(d[i]);
        }

        // Setのサイズ = 種類数
        System.out.println(values.size());
    }
}