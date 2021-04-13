import java.util.Scanner;
public class SumAdd {

    public static void main(String[] args) {
      double sum = 0;
      int flag = 1;
        for (int i = 1; i <= 100; i++) {
            sum+= flag*(1.0/i);
            flag = -flag;//加减替换
        }
        System.out.println(sum);
    }
}
