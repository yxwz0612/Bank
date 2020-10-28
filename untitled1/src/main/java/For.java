public class For {
    public static void main(String[] args) {
        int evenSum= 0;
        int oddSum = 0;
        for (int i = 0; i < 100; i++) {
            if(i%2!=0){
                oddSum+=i;

            }else {
                evenSum+=i;
            }




        }
        System.out.println(evenSum);
        System.out.println(oddSum);
    }
}
