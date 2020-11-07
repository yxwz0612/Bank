package exception;

public class text {
    public static void main(String[] args) {
        int a = 1;
        int b = 0;



        try{
            System.out.println(a/b);

        }catch (Error error){
            System.out.println("错误");

        }catch (Exception exception){
            System.out.println("异常");

        }catch (Throwable throwable){
            System.out.println("Throwable");

        }finally {
            System.out.println("终止程序");

        }
    }
}
