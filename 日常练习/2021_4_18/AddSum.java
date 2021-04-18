import java.util.Scanner;
public class AddSum{
    public static int addSum(int n){
        int sum = 0;
        if(n==1){
            return n;
        }else{
            return sum += n+addSum(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个正整数n,求1~n之和");
        int n = sc.nextInt();
        System.out.println(addSum(n));
    }
}

