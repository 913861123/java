import java.util.Arrays;

public class Transform{
    public static void transform(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = arr[i]*2;
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,};
        System.out.println("修改前");
        System.out.println(Arrays.toString(arr));
        transform(arr);
        System.out.println("修改后");
        System.out.println(Arrays.toString(arr));
    }
}

