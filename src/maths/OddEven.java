package maths;

public class OddEven {

    public static void main(String[] args) {
        System.out.println(isOdd(12));
    }

    private static boolean isOdd(int n) {
        return (n & 1) == 1;
    }

}
