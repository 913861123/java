import java.util.Scanner;
public class FrogPlatform {

    public static int frog(int n){
        if(n==1 || n==0){
            return 1;
        }else{
            return Frog(n-1)+Frog(n-2);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入台阶数量");
        int n = sc.nextInt();
        int ret = frog(n);
        System.out.println(ret);
    }
}

