import java.util.Scanner;
 
public class 사칙연산 {public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int fn = sc.nextInt();
        for (int i = 1; i <= fn; i++) {
            int c = sc.nextInt();
            int d = sc.nextInt();
            System.out.println("Case #" + i + ": " + (c + d));
        }
 
        sc.close();
    }
}