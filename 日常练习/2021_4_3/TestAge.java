import java.util.Scanner;
public class TestAge {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("输入一个年龄");
        int a = scan.nextInt();//输入一个整数
        if(a<18){
            System.out.println("少年");
        }
        else if(a>=18 && a<=28){
            System.out.println("青年");
        }
        else if(a>=29 && a<=55){
            System.out.println("中年");
        }
        else if(a>=56){
            System.out.println("老年");
        }
    }
}
