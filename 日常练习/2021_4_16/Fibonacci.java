import java.util.Scanner;
public class Fibonacci {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数求第N个斐波那契");
        int n = sc.nextInt();
        System.out.println(Fibo(n));
    }
    public static int Fibo(int n) {
        if (n == 1 || n == 2) {
            return 1;
        }
        int a = 1;
        int b = 1;
        int c = 0;
        while (n-2!= 0) {
            c = a + b;
            a = b;
            b = c;
            n--;
        }
        return b;
    }
}
