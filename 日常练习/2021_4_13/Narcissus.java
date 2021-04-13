import java.util.Scanner;
public class Narcissus {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 0; i <= 999; i++) {
            int cont = 0;
            int tmp = i;
            int sum = 0;
            //判断几位数
            while(tmp!=0){
                tmp/=10;
                cont++;
            }
            tmp = i;
            //累加每一位数
            while(tmp!=0){
                sum+=Math.pow(tmp%10,cont);
                tmp/=10;
            }
            //判断
            if(sum==i){
                System.out.println(i);
            }
        }
    }
}
