package DZ.DZ_1;

public class Exercise_2 {
    public static void main(String[] args) {
        // 2. Вывести все простые числа от 1 до 1000

        int n = 1000;

        for (int i = 2; i <= n; i++) {
            int temp = 0;
            for (int j = 1; j <= i/2; j++) {
                if (i % j == 0) {
                    temp++;
                }
            }
            if (temp <= 2) {
                // System.out.printf("%d ", i);
                System.out.println(i);
            }
        }
    }
    
}
