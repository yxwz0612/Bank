package method;

public class Max {
    public static void main(String[] args) {
      //  int a = FoundMax(1,2,4,6,8,9);
       // System.out.print(a);
        FoundMax(1,1,3,4,56,88,999);


    }
    public static void FoundMax(int...nubmers){
        if(nubmers.length == 0){
            System.out.println("请输入要比较大小的数");
            return;
        }else {
            int max = 0;
            for (int i = 0; i < nubmers.length; i++) {
                if(max<nubmers[i]){
                    max = nubmers[i];
                }
            }System.out.print(max);

            }
        }

}
