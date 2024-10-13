import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int numberOfWords = scanner.nextInt();
        scanner.nextLine();

        for (int i = 0; i < numberOfWords; i++) {
            String word = scanner.nextLine();
            if (word.length() == 3) {
                if (matches(word, "one")) {
                    System.out.println(1);
                } else if (matches(word, "two")) {
                    System.out.println(2);
                }
            } else if (word.length() == 5) {
                System.out.println(3);
            }
        }
    }

    private static boolean matches(String input, String reference) {
        int matchCount = 0;
        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) == reference.charAt(i)) {
                matchCount++;
            }
        }
        return matchCount >= 2;
    }
}