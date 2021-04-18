import java.util.Scanner;
public class Stratum{
    public static int stratum(int n){
        int tmp = 1;
        if(n==1){
            return n;
        }else{
            return tmp *= n*stratum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个正整数n,求n的阶层");
        int n = sc.nextInt();
        System.out.println(stratum(n));
    }
}

