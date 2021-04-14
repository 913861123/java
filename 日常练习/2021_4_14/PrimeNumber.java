import java.util.Scanner;
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int tmp = sc.nextInt();
        int flag = 0;
        for (int i = 2; i < tmp/2; i++) {
            if(tmp%i==0){
                flag = 1;
                System.out.println(tmp+"不是素数");
                break;
            }
        }
        if(flag == 0){
            System.out.println(tmp+"是素数");
        }

    }
}
