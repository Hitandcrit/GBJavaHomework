public class homework2
{
    public static void main(String[] args) {

        System.out.println(tusk1(10, 15));
        tusk2(123);
        tusk3(76);
        tusk4("", 99);
    }
    public static boolean tusk1(int a, int b) {
        int sum = a + b;
        if (sum > 10 && sum < 20) return true;
        else return false;
    }
    public static void tusk2(int a) {
        if (a >= 0)
            System.out.println(a + " positive");
        else
            System.out.println(a + " negative");
    }
    public static void tusk3(int a){
        if (a < 0) {
            System.out.println("true");
        } else {
            System.out.println("false"); }
     }
     public static void tusk4 (String value, int count) {
         for (int i = 1; i<count; i++) {
             System.out.println(i + " Овечка перепрыгнула через забор");
         }
     }
    }

