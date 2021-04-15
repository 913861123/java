import java.util.Scanner;
public class SimulatedLogin {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请设置你的密码");
        String password = sc.nextLine();
        System.out.println("密码设置成功，请输入你的密码登录");
        int cont = 3;
        while (cont != 0) {
            cont--;
            String tmp = sc.nextLine();
            if (password.equals(tmp)) {
                System.out.println("登录成功");
                break;
            }else{
                System.out.println("密码错误请重新输入");
            }
        }
        if (cont == 0) {
            System.out.println("输入错误次数3次，登录失败程序退出");
        }
    }
}
