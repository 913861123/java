import java.util.Scanner;
public class SwitchLight {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();
        int[] array = new int[n+1];//0表示灯为关闭状态

        for(int i = 1;i < array.length;i++){//初始化
            array[i] = i;
        }
        int cont = 1;//人
        while(cont <= m){
            if(cont == 1){
                for(int j = 1;j < array.length;j++){
                    array[j] = 0;
                }
                cont++;
            }else if(cont == 2){
                for(int i = 1;i < array.length;i++){
                    if(i%cont==0){
                        array[i] = i;
                    }
                }
                cont++;
            }else{
                for(int i = 1;i < array.length;i++){
                    if(i%cont == 0){
                        if(array[i] == 0){
                            array[i] = i;
                        }else{
                            array[i] = 0;
                        }
                    }
                }
                cont++;
            }

        }
        boolean flag = true;//判断最后一个灯的状态
        for(int i = 1;i<array.length;i++){
            if(array[i]==0){

                if(flag){
                    System.out.print(i);
                    flag = false;
                }else{
                    System.out.print(","+i);
                }
            }
        }

    }
}