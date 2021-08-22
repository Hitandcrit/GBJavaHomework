public class homework1 {


    public static void main(String[] args) {

        printThreeWords();
        task3();
        printColor(-1);
        compareNumbers(10, 5);

    }

    public static void printThreeWords() {
        System.out.println("Orange");
        System.out.println("Banana");
        System.out.println("Apple");
    }

    public static void task3() {
        int a = 5;
        int b = 10;
        int result = a + b;
        if (result >= 0) {
            System.out.println("Positive");
        } else {
            System.out.println("Negative");
        }
    }


    public static void printColor(int value) {
        if (value <= 0) {
            System.out.println("RED");
        } else if (value <= 100) {
            System.out.println("YELLOW");
        } else if (value >= 101) {
            System.out.println("GREEN");
        }
    }
    public static void compareNumbers(int a, int b) {
        if (a >= b) {
            System.out.println("a>=b");
        }
        else {
            System.out.println("a<b");
        }
        }
    }





