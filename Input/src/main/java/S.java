import java.util.Scanner;

public class S {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        int i = 0;
        double sum = 0;
        double p = 0;


        while (sca.hasNextInt()){
            i =i+1;
            double x = sca.nextInt();
            sum = sum + x;
            p = sum / i;

        }
        System.out.println(sum);
        System.out.println(p);



    }
}