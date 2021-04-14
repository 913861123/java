import java.util.Scanner;
public class Binary {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cont = 0;
        System.out.println("输入一个整数求二进制中1的个数");
        int x = sc.nextInt();
        while(x!=0){
            if( (x&1) == 1){
                cont++;
            }
            x = x>>>1;
        }
        System.out.println("1的个数为"+cont);
    }
}
