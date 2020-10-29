public class Array {
    public static void main(String[] args) {
        int[] numbers;//声明一个数组numbers
        numbers = new int[10];//创建一个数组
        int [][] numbers2 ={{1,2},{2,3},{4,5},{7,8}};

        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        numbers[3] = 4;
        numbers[4] = 5;
        numbers[5] = 6;
        numbers[6] = 7;
        numbers[7] = 8;
        numbers[8] = 9;
        numbers[9] = 10;


       // numbers.length 获得数组长度
    //    System.out.println(numbers[0]);

        printArray(numbers);






    }

    //打印数组
    public static  void printArray(int[] array){
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);



        }return;



        /*for (int i = array.length-1; i <= 0 ; i--) {
            System.out.println(array[i]);

        }*/
    }
}
