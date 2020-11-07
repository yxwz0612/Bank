package app;

public class text3 {
    public static void main(String[] args) {

        try {
            function();
        } catch (NumberFormatException e) {
            System.err.println("非数据类型不能转换。");

        }

    }

    public static void function() throws NumberFormatException{
        String s = "abc";
        System.out.println(Double.parseDouble(s));
    }


}
