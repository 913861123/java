import java.util.Scanner;
import java.util.Random;
public class NumberGame {

    public static void main(String[] args) {
        Random random = new Random();
        Scanner sc  = new Scanner(System.in);

        int ran = random.nextInt(100)+1;//生成[0-100)的随机数
        while(true){
            System.out.println("请输入0-100要猜的数字");
            int x = sc.nextInt();
            if(ran < x){
                System.out.println("猜大了");
            }else if(ran > x){
                System.out.println("猜小了");
            }else{
                System.out.println("猜对了");
                break;
            }

        }
    }
}
