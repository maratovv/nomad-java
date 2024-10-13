import java.util.Scanner;

class b1243 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        while (sc.hasNextLine()) {
            String line = sc.nextLine();
            System.out.println(calculateDifficulty(line));
        }
    }

    public static int calculateDifficulty(String input) {
        String[] words = input.split(" ");
        int wordCount = 0;
        int totalLength = 0;

        for (String word : words) {
            if (isValidWord(word)) {
                int wordLength = countLetters(word);
                totalLength += wordLength;
                wordCount++;
            }
        }

        if (wordCount == 0) {
            return 250;
        }

        int averageLength = totalLength / wordCount;

        if (averageLength <= 3) {
            return 250;
        } else if (averageLength == 4 || averageLength == 5) {
            return 500;
        } else {
            return 1000;
        }
    }

    public static boolean isValidWord(String word) {
        if (word.endsWith(".")) {
            word = word.substring(0, word.length() - 1);
        }

        for (int i = 0; i < word.length(); i++) {
            char ch = word.charAt(i);
            if (!Character.isLetter(ch)) {
                return false;
            }
        }
        return word.length() > 0;
    }

    public static int countLetters(String word) {
        int count = 0;
        for (int i = 0; i < word.length(); i++) {
            if (Character.isLetter(word.charAt(i))) {
                count++;
            }
        }
        return count;
    }
}