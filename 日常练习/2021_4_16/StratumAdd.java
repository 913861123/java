import java.util.Scanner;
public class StratumAdd {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数求1！~n!的和");
        int n = sc.nextInt();
        int ret = 0;
        int tmp = 1;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            ret = i;
            while(ret!=0){
                tmp*=ret;
                ret--;
            }
            sum+=tmp;
            tmp = 1;
        }
        System.out.println(sum);
    }
}
