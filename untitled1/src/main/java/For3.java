public class For3 {
    public static void main(String[] args) {
        for (int i = 1; i <= 9; i++) {
            for (int i1 = 1; i1 <= i; i1++) {
                System.out.print(i1+"x"+i+"="+i*i1+"\t");

            }
            System.out.print("\n");


        }
    }
}
