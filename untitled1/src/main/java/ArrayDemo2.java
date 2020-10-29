public class ArrayDemo2 {
    public static void main(String[] args) {
        //数组排序
        int[] array = {1,-4,65,174,3,154,31,44,174};


 //       printArray(sort1(array));
  //      System.out.println("\n"+"------------");
        printArray(bubblesort(array));
  //      System.out.println(array[0]);
        
        
    }
    public static int[] sort1(int[] array2){
        int max = 0;
        int maxI = 0;

        for (int j = 0; j < array2.length ; j++) {
            max = 0;
            for (int i = 0; i < array2.length-j; i++) {
                if(max<array2[i]){
                    max = array2[i];
                    maxI = i;
                }
            }
            array2[maxI]= array2[(array2.length-1-j)];
            array2[(array2.length-1-j)] = max;
        }return array2;


    }


    public static  void printArray(int[] array){
            for (int i = 0; i < array.length; i++) {
                System.out.println(array[i]);
            }return;
    }

    //冒泡排序
    //依次比较相邻两个数的大小,按某种规则(比如升序),逐个调换两个数的排列
    //每次排序都会产生一个最大或者最小数
    //下一轮次则可以减少一次排序




    public static int[] bubblesort(int[] array){
        int bubble = 0;
        for (int i = array.length-1; i >= 0 ; i--) {
            for (int j = 0; j <array.length-1 ; j++) {
                if(array[j]>array[j+1]){
                    bubble = array[j];
                    array[j] = array[j+1];
                    array[j+1] = bubble;
                }

            }

        }
        return array;
    }


}
