import java.util.Arrays;
public class BubbleSort{
    public static void bubbleSort(int[] arr){
        boolean flag = false;
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = 0; j < arr.length-1-i; j++) {
                if(arr[j]>arr[j+1]){
                    int tmp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = tmp;
                    flag = true;//数组不是有序的
                }
            }
            if(flag==false){//如果数组已经是有序的话跳出循环
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] array = {9, 2, 3, 6, 7, 4, 1, 5, 8};
        System.out.println("冒泡前："+Arrays.toString(array));
        bubbleSort(array);
        System.out.println("冒泡后："+Arrays.toString(array));
    }
}

