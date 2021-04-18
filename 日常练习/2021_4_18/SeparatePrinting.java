import java.util.Scanner;
public class SeparatePrinting{
    public static void separatePrinting(int n){
        if(n<=9){
            System.out.println(n+" ");
        }else{
            separatePrinting(n/10);
            System.out.println(n%10+" ");

        }
    }
    public static void main(String[] args) {
        Scanner sc =  new Scanner(System.in);
        System.out.println("请输入一个正整数");
        int n = sc.nextInt();
        separatePrinting(n);
    }
}

