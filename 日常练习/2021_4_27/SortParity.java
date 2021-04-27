import java.util.Arrays;

public class SortParity {

    public static void sortParity(int[] arr){
        int left = 0;
        int right = arr.length-1;
        while(left<right){
            //从前向后找奇数
            while(left<right && left<arr.length-1){
                if(arr[left]%2!=0){
                    break;
                }
                left++;
            }
            //从后向前找偶数
            while(left<right && right>0){
                if(arr[right]%2==0){
                    break;
                }
                right--;
            }
            int tmp = arr[left];
            arr[left] = arr[right];
            arr[right] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        System.out.println("排序前"+ Arrays.toString(arr));
        sortParity(arr);
        System.out.println("排序后"+ Arrays.toString(arr));
    }
}
