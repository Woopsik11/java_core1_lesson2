package HomeWork.java_core1.lesson2;

public class HomeWorkTwo {
    public static void main(String[] args) {
        System.out.println(twoNumbers(5, 9));
        System.out.println(isPositive(11));
        System.out.println(isNegative(23));
        String s = "Hi";
        int counter = 5;
            printNumbers("Hi", 5);
    }
    private static boolean twoNumbers ( int first, int second) {
        int sum = first + second;
        return sum <= 20 && sum >= 10;
    }


    private static boolean isPositive(int variable) {
        return variable >= 0;
    }

    private static boolean isNegative(int number) {
        return number < 0;
    }

    private static void printNumbers(String s, int count) {
        for (int i = 0; i < count; i++) {
            System.out.println(s);
        }
    }
}
