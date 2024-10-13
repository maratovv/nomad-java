import java.util.Scanner;

public class oppo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int testCases = Integer.parseInt(scanner.nextLine());

        for (int i = 0; i < testCases; i++) {
            String sentence = scanner.nextLine();
            boolean[] alphabet = new boolean[26];
            int uniqueCount = 0;

            for (int j = 0; j < sentence.length(); j++) {
                char c = sentence.charAt(j);
                if (Character.isLetter(c)) {
                    int index = Character.toLowerCase(c) - 'a';
                    if (!alphabet[index]) {
                        alphabet[index] = true;
                        uniqueCount++;
                    }
                }
            }

            if (uniqueCount == 26) {
                System.out.println("frase completa");
            } else if (uniqueCount >= 13) {
                System.out.println("frase quase completa");
            } else {
                System.out.println("frase mal elaborada");
            }
        }

        scanner.close();
    }
}