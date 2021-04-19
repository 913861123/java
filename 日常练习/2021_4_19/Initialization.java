import java.util.Arrays;

public class Initialization{
    public static void initialization(int[] arr){
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i+1;
        }
        System.out.println();
    }
    public static void main(String[] args) {
        int[] arr = new int [100];
        initialization(arr);
        System.out.println(Arrays.toString(arr));
    }
}

