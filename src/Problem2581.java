import java.util.Scanner;

public class Problem2581 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int M = sc.nextInt();
        int N = sc.nextInt();

        int min = Integer.MAX_VALUE; // 최소 소수
        int sum = 0; // 소수들의 합

        for (int i = M; i <= N; i++) { // 범위 주의: i <= N
            if (isPrime(i)) {
                sum += i;
                if (i < min) {
                    min = i;
                }
            }
        }

        if (sum == 0) {
            System.out.println(-1);
        } else {
            System.out.println(sum);
            System.out.println(min);
        }

        sc.close();
    }

    private static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
}