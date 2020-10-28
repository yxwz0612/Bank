package app;

import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        Scanner sca = new Scanner(System.in);
        double result = 0.0d;
        boolean noResult = true;
        int fuhao = 0;
        while (true){
    //        System.out.println(result+"----"+result2+"----"+fuhao);//调试
            if(sca.hasNextInt()){
                if (noResult == true){
                result = sca.nextInt();
                noResult = false;
                }else if(fuhao!=0) {
                result = count(result, sca.nextInt(), fuhao);
                System.out.println(result);
                noResult = false;
                fuhao = 0;
                }else{
                noResult = true;
                }


            }else{
            fuhao = makeSure(sca.next());
            noResult = false;//保留运算结果不被新输入的数字替换
        }


        }





    }//确定运算符号
    public static int makeSure(String a) {
        switch (a) {
            case "+":
                return 1;
            case "-":
                return 2;
            case "*":
                return 3;
            case "/":
                return 4;
            default:
                return 0;
        }
    }

//根据运算符号计算得数
    public static double count(double a,int b,int c){
        switch (c){
            case 1:return a+b;
            case 2:return a-b;
            case 3:return a*b;
            case 4:return a/b;
            default:return 66666;
        }
    }
}
