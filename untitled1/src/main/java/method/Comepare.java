package method;

public class Comepare {
    public static void main(String[] args) {

        int a = bigger(3,6,9);
        System.out.print(a);


    }
    public static int bigger(int a,int b){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
    public static int bigger(int a,int b,int c){
        if(a>b){
            return a;
        }else {
            return b;
        }
    }
}
