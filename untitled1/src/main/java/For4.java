public class For4 {
    public static void main(String[] args) {

        //打印101-150之间所有的质数

        for (int i = 100; i < 150; i++) {
            for (int i1 = 2; i1 < i; i1++) {
                if(i%i1==0){
                    break;
                }if(i1==i-1){
                    System.out.println(i);

                }
            };


        }
    }
}
