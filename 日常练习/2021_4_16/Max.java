import java.util.Scanner;
public class Max{
    public static int Max2(int a,int b){
        return Math.max(a,b);
    }
    public static int Max3(int a,int b,int c){
        return Math.max(Max2(a,b),c);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入三个整数求最大值");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        int ret = Max3(a,b,c);
        System.out.println(ret);
    }
}
