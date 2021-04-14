import java.util.Scanner;
public class PrimeNumber2 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入一个整数");
        int tmp = sc.nextInt();
        int flag = 0;
        for (int i = 2; i <= Math.sqrt(tmp); i++) {//如果一个数是素数，那么2到这个数的开平方中一定有一个数能整除这个数
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
