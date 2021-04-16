import java.util.Scanner;
public class Stratum {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数,求阶层");
        int n = sc.nextInt();
        int sum = 1;
        while(n!=0){
            sum*=n;
            n--;
        }
        System.out.println(sum);
    }
}
