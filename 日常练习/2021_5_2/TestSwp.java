
class MySwap{
    public int val;
    
}
public class TestSwp{
    public static void swap(MySwap mySwap1,MySwap mySwap2){
        int tmp = mySwap1.val;
        mySwap1.val = mySwap2.val;
        mySwap2.val = tmp;

    }
    public static void main(String[] args){
        MySwap mySwap1 = new MySwap();
        mySwap1.val = 10;
        MySwap mySwap2 = new MySwap();
        mySwap2.val = 20;
        swap(mySwap1,mySwap2);
        System.out.println("交换前");
        System.out.println(mySwap1.val);
        System.out.println(mySwap2.val);
        System.out.println("交换后");
        System.out.println(mySwap1.val);
        System.out.println(mySwap2.val);

    }
}