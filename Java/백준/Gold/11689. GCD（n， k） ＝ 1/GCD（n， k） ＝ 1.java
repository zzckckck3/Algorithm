import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/*
* 자연수 n이 주어졌을 때, GCD(n, k) = 1을 만족하는 자연수 1 ≤ k ≤ n 의 개수를 구하는 프로그램을 작성하시오.
* */
public class Main {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        long n = Long.parseLong(br.readLine());
        long pi = n;
        for(long i = 2; i * i <= n; i++) {
            if(n % i == 0) {
                pi = pi / i * (i - 1);
            }
            while(n % i == 0) {
                n /= i;
            }

        }
        if(n != 1) {
            pi = pi / n * (n - 1);
        }
        System.out.println(pi);
    }
}