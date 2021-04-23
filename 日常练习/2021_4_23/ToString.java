
public class ToString{
    public static String toString(int[] array){
        String str = "[";
        for (int i = 0; i < array.length; i++) {
            if(i < array.length-1){
                str = str+array[i]+",";
            }else{
                str = str+array[i]+"]";
            }
        }

        return str;
    }
    public static void main(String[] args) {
        int[] array = {1,2,3,4,5,6,7,8,9};
        System.out.println(toString(array));
    }
}

