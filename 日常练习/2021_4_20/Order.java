import java.util.Arrays;

public class Order{
        public static boolean order(int[] arr){
            if(arr==null) return false;
            //判断升序
            if(arr[0]>=arr[1]){
                for (int i = 0; i < arr.length-1; i++) {
                    if(arr[i]>arr[i+1]){
                        return false;
                    }
                }
                //判断降序
            }else{
                for (int j = 0; j < arr.length-1; j++) {
                    if (arr[j] < arr[j + 1]) {
                        return false;
                    }
                }
            }

            return true;
        }

        public static void main(String[] args) {
            int[] arr = {1,1,2,2,5,6,6};
            System.out.println(order(arr));
        }
}

