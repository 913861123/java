public class PrimeNumber {

    public static void main(String[] args){
        int i = 0;
        int j = 0;
        int flag = 0;
        for(i=100;i<=200;i++){
            for(j=2;j<Math.sqrt(i);j++){//如果i是素数那么2到根号i中一定有个数字能整除i
                if(i%j==0){
                    flag = 1;
                    break;
                }
            }
            if(flag==0){
                System.out.println(i);
            }
            flag = 0;
        }
    }
}
