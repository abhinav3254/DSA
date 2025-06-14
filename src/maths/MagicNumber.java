package maths;

public class MagicNumber {

    public static void main(String[] args) {
        System.out.println(magicNumber(5));
    }

    private static int magicNumber(int n) {
        int ans = 0;
        int base = 5;
        while (n > 0) {
            int last = n & 1;
            n = n >> 1;
            ans += base * last;
            base *= 5;
        }
        return ans;
    }

}
