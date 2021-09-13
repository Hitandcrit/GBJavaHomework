public class homework3 {

    public static void main(String[] args) {
        int[] task1 = {1, 0, 1, 0, 0, 0, 0, 1, 1, 1, 1, 1};
        int[] task3 = {1, 2, 3, 4, 5, 6, 7, 8, 9, 0,};

        replaceArrayValues(task1);
        change(task1);
        replaceArrayValues(task1);
        System.out.println("");
        Task2(100);
        System.out.println("");
        Task3(task3);
        System.out.println("");
        Task4();
        System.out.println("");
        Task5(5, 1);
    }

    public static void replaceArrayValues(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
        }
        System.out.println();
    }

    public static void change(int[] array) {
        for (int i = 0; i < array.length; i++)
            if (array[i] == 1) {
                array[i] = 0;
            } else {
                array[i] = 1;
            }
    }
    public static void Task2(int size) {
        int[] arr = new int[size];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = i + 1;
            System.out.print(arr[i] + " ");
        }
    }
    public static void Task3(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < 6) {
                arr[i] = arr[i] * 2;
            }System.out.print(arr[i]);
        }
    }
    public static void Task4() {
        int[][] arr = {
                {1, 0, 1},
                {0, 1, 0},
                {1, 0, 0}};
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (i == j) {
                    arr[i][j] = 1;
                }
                System.out.print(arr[i][j]);
            }
            System.out.println();
        }
    }
    public static void Task5(int len, int initialValue){
        int[] arr = new int[len];
        for (int i = 0; i < len; i++) {
            arr[i] = initialValue;
            System.out.print("[" + i + "]" + arr[i] + " ");
        }
    }
}

