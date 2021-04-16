public class SingleAf {

    /**
     * 找出单身狗
     * @param arr
     */
    public static void singleaf(int[] arr){
        for (int i = 0; i < arr.length-1; i++) {
            for (int j = i+1; j < arr.length; j++) {
                arr[i] = arr[i]^arr[j];
            }
        }
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]!=0){
                System.out.println("单身狗为 "+arr[i]);
                break;
            }
        }
    }
    public static void main(String[] args) {
        int[] arr = {1,8,1,2,2,3,3,4,4,5,5,6,6,};
        singleaf(arr);
    }
}
