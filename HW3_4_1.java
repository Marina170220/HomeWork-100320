package KompjuterIya.HomeWork;

import org.w3c.dom.ls.LSOutput;

public class HW3_4_1 {
    static int factorial(int n) {
        int result = 1;
        for (int i = 1; i <= n; i++) {
            result *= i;
        }
        return result;
    }

    public static void main(String[] args) {
        System.out.println(factorial(10));
    }
}
