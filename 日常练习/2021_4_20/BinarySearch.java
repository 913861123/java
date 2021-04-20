import java.util.Arrays;

public class BinarySearch{
        public static int binarySearch(int[] arr,int x){
            int left = 0;
            int right = arr.length-1;
            int mid = 0;//中间下标

            while(left <= right){
                mid = left+(right-left)/2;
                if(arr[mid] > x){
                    right = mid - 1;
                }else if(arr[mid] < x){
                    left = mid+1;
                }else{
                    return mid;
                }
            }

            return -1;
        }


        public static void main(String[] args) {
            int[] arr = {1,2,3,4,5,8,9,11,20,55};
            int ret = binarySearch(arr,4);

            if(ret == -1){
                System.out.println("没找到");
            }else{
                System.out.println("找到了，下标是"+ret);
            }
        }
}

