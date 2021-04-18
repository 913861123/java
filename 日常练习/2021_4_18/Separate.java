import java.util.Scanner;
public class Separate{
    public static int separateAdd(int n){
        int sum = 0;
        if(n<=9){
            return n;
        }else{
            return sum+=n%10+separateAdd(n/10);
        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int n = sc.nextInt();
        System.out.println(separateAdd(n));
    }
}

