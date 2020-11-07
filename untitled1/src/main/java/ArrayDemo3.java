public class ArrayDemo3 {
    public static void main(String[] args) {
        int[][] aaaaa = {{0,0,0,22,0,0},{0,2,0,0,0,3},{4,0,0,0,0,5},{0,7,0,0,0,0}};

        int[][] bbbbb = makeArray(aaaaa);
        printArray(aaaaa);
        System.out.print("--------原数组-----------\n");
        printArray(bbbbb);
        System.out.print("--------稀疏数组------------\n");
        printArray(restoreArray(bbbbb));
        System.out.print("--------还原数组------------\n");

    }
//把一个二位数组转化为一个稀疏数组

    public static int[][] makeArray(int[][] array){
        int[][] newarray = new int[7][3];
        int num = 0;



        for (int i = 0; i < array.length; i++) {
            newarray[0][0] = array.length;//在稀疏数组中记录二维数组的行数列数
            newarray[0][1] = array[0].length;

            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] != 0){
                    num+=1;//统计不为零的数据个数
                    newarray[0][2] = num;//在数组中记录不为零的数据个数

                    newarray[num][0] = i;
                    newarray[num][1] = j;
                    newarray[num][2] = array[i][j];

                }

            }
        }return newarray;
    }
//打印一个二维数组
    public static void printArray(int[][] array){
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j]+"\t");
            }System.out.print("\n");
        }

    }//还原一个稀疏数组
    public static int[][] restoreArray(int[][] array){
        int[][] newarray = new int[array[0][0]][array[0][1]];

        for (int i = 1; i < array.length; i++) {
            newarray[array[i][0]][array[i][1]] = array[i][2];
        }return newarray;
    }

}
