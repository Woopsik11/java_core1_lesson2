package HomeWork3;

public class HomeWork3 {

    public static void main(String[] args) {
        zeroArr();
        fillArray(100, 1);
        twoArray(6, 5);
        threeArray();
        diagonalArr(3,3);


    }
        private static void zeroArr () {
            int[] arr = {1, 0, 1, 1, 1, 0, 1, 0};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] == 1)
                    arr[i] = 0;
                 else
                    arr[i] = 1;
            }
            System.out.println("zeroArr");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        private static void fillArray(int size, int step) {
            int[] arr = new int[100];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = i * step;
            }
            System.out.println("fillArray");
            for (int i = 0; i < arr.length; i++) {
                System.out.println(arr[i]);
            }
        }

        private static void threeArray() {
            int[] arr = {1, 5, 3, 2, 11, 4, 5, 2, 5, 8, 9, 1};
            for (int i = 0; i < arr.length; i++) {
                if (arr[i] < 6){
                    i = i * 2;
                }
            }

            System.out.println("threeArray");
            for (int i = 0; i < arr.length; i++)
            System.out.println(arr[i]);
        }

        private static void diagonalArr(int size, int value) {
            int[][] diagonalArr = new int[size][size];
            for (int i = 0; i < size; i++) {
                for (int j = 0; j < size; j++) {
                    System.out.println(diagonalArr[i][j] + " ");
                }
                System.out.println();
            }
        }




        private static void twoArray ( int len, int initialValue){
            int[] arr = new int[len];
            for (int i = 0; i < len; i++) {
                arr[i] = initialValue;
            }
            System.out.println("twoArray");
            for (int i = 0; i < len; i++)
                System.out.println(arr[initialValue]);

        }

}
