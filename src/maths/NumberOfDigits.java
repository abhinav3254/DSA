package maths;

public class NumberOfDigits {

    public static void main(String[] args) {
        System.out.println(calDigits(16,2));
        System.out.println(calDigits(23456781,10));
    }

    private static int calDigits(int n,int base) {
        return (int) (Math.log(n)/Math.log(base)) + 1;
    }

}
