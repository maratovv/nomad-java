import java.util.Scanner;

public class Main {
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (scanner.hasNextLine()) {
            String input = scanner.nextLine();
            long number = 0;
            boolean hasError = false;

            for (int i = 0; i < input.length(); i++) {
                char digit = input.charAt(i);

                if (digit == ' ' || digit == ',') {
                    continue;
                }

                if (digit == 'O' || digit == 'o') {
                    digit = '0';
                } else if (digit == 'l') {
                    digit = '1';
                }

                if (digit < '0' || digit > '9') {
                    hasError = true;
                    break;
                }

                number = number * 10 + (digit - '0');

                if (number > 2147483647) {
                    hasError = true;
                    break;
                }
            }

            if (hasError || input.isEmpty()) {
                System.out.println("error");
            } else {
                System.out.println(number);
            }
        }
    }
}