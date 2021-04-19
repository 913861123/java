public class SingleAf {

    /**
     * 找出单身狗
     * @param arr
     */
    public static int singleaf(int[] arr){
            int tmp = 0;
            for (int i = 0; i < arr.length; i++) {
                tmp^=arr[i];
            }

            return tmp;
    }

        public static void main(String[] args) {
            int[] arr = {1,1,2,2,5,6,6};
            System.out.println(singleaf(arr));
        }
}
