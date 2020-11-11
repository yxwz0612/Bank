package CommonException;

public class CommonException extends Exception{


    public static class OverLimit extends CommonException{
        public OverLimit(){
            System.out.println("取款金额超过每日限额");
        }

    }

    public static class NoBalance extends CommonException {
        public NoBalance(){
            System.out.println("余额不足请重新输入");
        }

    }

    public static class Limitis0 extends CommonException{
        public Limitis0(){
            System.out.println("取款上限不能为0");
        }

    }

    public static class NeedInt extends CommonException{
        public NeedInt(){
            System.out.println("请输入整数");
        }

    }




}


