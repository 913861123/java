import java.util.Scanner;
public class Hanoi {
    /**
     * 打印过程
     * @param a
     * @param b
     */
    public static void movePrints(char a,char b){
        System.out.println(a+"->"+b);
    }

    public static void hanoi(int n,char a,char b,char c){

        if(n==1){
            movePrints(a,c);
        }else{

            hanoi(n-1,a,c,b);
            movePrints(a,c);
            hanoi(n-1,b,a,c);
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入汉诺塔层数");
        int n = sc.nextInt();
        hanoi(n,'A','B','C');
    }
}

