import java.util.Arrays;
public class Test{
    public static int[] copyOf(int[] array){
        int[] arr = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            arr[i] = array[i];
        }

        return arr;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5};
        System.out.println(Arrays.toString(copyOf(array)));
    }
}

