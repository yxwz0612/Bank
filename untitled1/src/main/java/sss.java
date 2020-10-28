import java.util.Scanner;

public class sss {
            public static void main(String[] args) {
            Scanner sca = new Scanner(System.in);
            int i = 0;
            double sum = 0;
            double p = 0;
            String a = "";
while((sca.hasNext()&&(a!="stop"))) {
        a = sca.next();
        boolean c = a != "stop";
        System.out.println(c);
        while (sca.hasNextInt()) {

        i = i + 1;
        double x = sca.nextInt();
        sum = sum + x;
        System.out.println(sum);
        System.out.println(a);
        p = sum / i;

    }
}

            System.out.println(sum);
            System.out.println(p);

    }
}
