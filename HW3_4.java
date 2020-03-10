package KompjuterIya.HomeWork;

public class HW3_4 {

    public static void main(String[] args) {
        int factorial = 1;
        int n = 10;
        for (int i = 1; i <= n; i++) {
            factorial *= i;
        }
        System.out.println(factorial);
    }
}
