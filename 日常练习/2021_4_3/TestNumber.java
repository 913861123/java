public class TestNumber {

    public static void main(String[] args) {
        int cont = 0;
        int i =9;
        while(i<100){
            if(i%10==9||i/10==9){
                cont++;
            }if(i<89){
                i+=10;
            }else{
                i+=1;
            }
        }
        System.out.println(cont);
    }
}
