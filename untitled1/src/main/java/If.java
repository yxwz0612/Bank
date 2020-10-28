import java.util.Scanner;

public class If {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String InforMation = sca.nextLine();
        if(InforMation.equals("成功")){
            System.out.println("收购");
        }else {
            System.out.println("自己开发");
        }
        System.out.println("运行结束");


    }
}
