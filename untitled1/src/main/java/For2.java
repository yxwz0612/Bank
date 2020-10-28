public class For2 {
    public static void main(String[] args) {
        //输出1000以内，能被5整除的数，并且每行输出三个。

        int a = 0;

        for (int i = 0; i <= 1000; i++) {
            if(i%5==0){
                System.out.print(i);
                a++;
                if(a%3==0){
                    System.out.print("\n");
                }else {
                    System.out.print("\t");
                }

            }


        }
    }
}
