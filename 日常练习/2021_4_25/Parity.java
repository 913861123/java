import java.util.Arrays;
public class Parity{
    public static void Parity(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            while (arr[left]%2==0 &&left<right){//从前往后找奇数
                left++;
            }
            while(arr[right]%2!=0 && left<right){//从后往前找偶数
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] array = {1,2,4,80,50,7,11,13,22,16,77};
        System.out.println("排序前："+Arrays.toString(array));
        Parity(array);
        System.out.println("排序后："+Arrays.toString(array));
    }
}

