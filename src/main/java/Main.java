import java.util.*;

public class Main {
    public static void main(String[] args) {
        int a = power(2, 3); // 2 to the power of 3
        System.out.println(a);
    }

    public static int power(int base, int exponent) {
        if (exponent == 0) {
            return 1;
        } else {
            return base * power(base, exponent - 1);
        }
    }
}