import java.util.Scanner;
public class CommonDivisor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入两个正整数求最大公约数");
        int a = sc.nextInt();
        int b = sc.nextInt();
        while(a%b!=0){
            int c = a%b;
            a = b;
            b = c;

        }
        System.out.println("最大公约数为"+b);
    }
}
