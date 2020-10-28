public class For5 {
    public static void main(String[] args) {
        int a1=4;
        int a2=1;


        for (int i = 0; i < 5; i++) {


            for (int i1 = 0; i1 < a1; i1++) {
                System.out.print(" ");
            }
            for (int i1 = 0; i1 < a2; i1++) {
                System.out.print("*");
            }
         //   for (int i1 = 0; i1 < a1; i1++) {
         //       System.out.print(" ");
         //   }
            System.out.print("\n");
            a1--;
            a2+=2;
        }
    }
}
