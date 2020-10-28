import java.util.Scanner;

public class Swich {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        String date = sca.nextLine();
        switch (date){
            case "星期一" :
                System.out.println("Monday");
                break;
            case "星期二" :
                System.out.println("Tuesday");
                break;
            case "星期三" :
                System.out.println("Wednesday");
                break;
            case "星期四" :
                System.out.println("Thursday");
                break;
            case "星期五" :
                System.out.println("Friday");
                break;
            case "星期六" :
                System.out.println("Saturday");
                break;
            case "星期七" :
                System.out.println("Sunday");
                break;
            default:
                System.out.println("请输入：星期几");
        }



    }
}
