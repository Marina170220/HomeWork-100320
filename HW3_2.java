package KompjuterIya.HomeWork;

public class HW3_2 {
    public static void main(String[] args) {
        int n = 1_000_000_000;
        int a1 = 0;
        int a2 = 1;
        int a = 1;
        System.out.print(a1 + " " + a2 + " ");
        while (a <= n) {
            a = a1 + a2;
            a1 = a2;
            a2 = a;
            System.out.print(a + " ");
        }
    }
}
