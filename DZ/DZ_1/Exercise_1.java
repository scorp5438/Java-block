package DZ.DZ_1;

public class Exercise_1 {
    public static void main(String[] args) {
        /*
         * 1. Вычислить n-ое треугольного число(сумма чисел от 1 до n)
         * n! (произведение чисел от 1 до n)
         */

        // n-ое число треугольного

        int n = (int) (Math.random() * 10);
        System.out.printf("n = " + "%d\n", n);
        int res = 0;
        for (int i = 0; i <= n; i++) {
            res += i;
        }
        System.out.printf("res = " + "%d\n", res);

        // *********************************************************************************
        // n!

        int n2 = (int) (Math.random() * 10);
        System.out.printf("n2 = " + "%d\n", n2);
        int res2 = 1;
        for (int i = 1; i <= n2; i++) {
            res2 *= i;
        }
        System.out.printf("res2 = " + "%d", res2);
    }

}
