public class AverageValue{
    public static double avg(int[] arr){
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum+arr[i];
        }

        return sum*1.0/arr.length;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(avg(arr));
    }
}

