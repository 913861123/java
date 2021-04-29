import java.util.Arrays;

public class ArraySwapping {

    public static void arraySwapping(int[] arr,int[] arr2){
        for (int i = 0; i < arr.length; i++) {
            int tmp = arr[i];
            arr[i] = arr2[i];
            arr2[i] = tmp;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5,6,7,8,9,10};
        int[] array = {11,12,13,14,15,16,17,18,19,20};
        System.out.println("交换前");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
        arraySwapping(arr,array);
        System.out.println("交换后");
        System.out.println(Arrays.toString(arr));
        System.out.println(Arrays.toString(array));
    }
}
