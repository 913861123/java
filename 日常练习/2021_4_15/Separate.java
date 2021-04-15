

import java.util.Scanner;
public class Separate {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("输入一个整数");
        int n = sc.nextInt();
        while(n!=0){
            System.out.println(n%10+" ");
            n/=10;
        }
    }
}
