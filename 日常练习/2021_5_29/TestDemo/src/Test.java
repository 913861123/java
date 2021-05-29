public class Test {
    public static void main(String[] args) {
        char[] array = new char[]{'a','b','c','d'};
        String str =  String.copyValueOf(array,0,2);
        System.out.println(str);
    }
    public static void main2(String[] args) {
        StringBuilder str = new StringBuilder("abc");
        str.append("def");
        System.out.println(str);
        str.reverse();
        System.out.println(str);
    }
    public static void main1(String[] args) {
        StringBuffer str = new StringBuffer("bit");
        for (int i = 0; i < 4; i++) {
            str.append(str);
        }
        System.out.println(str);
    }
}
