import java.util.Scanner;
public class ParityBinary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("输入一个整数");//获取一个数二进制序列中所有的偶数位和奇数位， 分别输出二进制序列
        int x = sc.nextInt();
        System.out.print("偶数位->");
        for (int i = 31; i >= 0; i-=2) {
            System.out.print((x>>>i)&1);//二进制的偶数位
        }
        System.out.println();
        System.out.print("奇数位->");
        for (int i = 30; i >= 0; i-=2) {
            System.out.print((x>>>i)&1);//二进制的奇数位
        }
    }
}
