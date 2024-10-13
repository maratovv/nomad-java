import java.util.Scanner;

public class oppo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        System.out.println("Введите количество тестов:");
        int N = scanner.nextInt();


        for (int i = 0; i < N; i++) {

            System.out.println("Введите начальный запас еды для теста " + (i + 1) + ":");
            double X = scanner.nextDouble();
            int days = 0;


            while (X > 1.0) {
                X /= 2;
                days++;
            }


            System.out.println("Результат для теста " + (i + 1) + ": " + days + " dias");
        }

        scanner.close();
    }
}
