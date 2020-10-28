package method;

public class Factorial {
    public static void main(String[] args) {
        System.out.print(f(15));
        System.out.print(fa(15));

    }
    public static int f(int number){
        if (number==1){
            return 1;
        }else return number*f(number-1);

    }

    public static int fa(int nubmer){
        int a = 1;
        for (int i = 1; i <= nubmer; i++) {
            a = a*i;


        }return a;
    }
}
