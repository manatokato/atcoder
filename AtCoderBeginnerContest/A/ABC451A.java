package AtCoderBeginnerContest.A;
import java.util.Scanner;

public class ABC451A {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        String S = sc.next();
        
        boolean valid = (S.length() % 5 == 0);

        System.out.println(valid ? "Yes" : "No");
    }
}