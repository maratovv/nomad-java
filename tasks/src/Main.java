import java.util.Scanner;

public class Main {

    public static void printGreeting(String name) {
        System.out.println("Привет, " + name + "!");
    }

    public static void displayArray(int[] array) {
        for (int element : array) {
            System.out.println(element);
        }
    }

    public static int findMax(int[] array) {
        int max = array[0];
        for (int value : array) {
            if (value > max) {
                max = value;
            }
        }
        return max;
    }

    public static int countVowels(String input) {
        int count = 0;
        for (char c : input.toCharArray()) {
            if ("аеёиоуыэюяАЕЁИОУЫЭЮЯ".indexOf(c) != -1) {
                count++;
            }
        }
        return count;
    }

    public static double calculateAverage(int[] array) {
        double sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum / array.length;
    }

    public static double fahrenheitToCelsius(double fahrenheit) {
        return (fahrenheit - 32) * 5 / 9;
    }

    public static String reverseString(String input) {
        StringBuilder reversed = new StringBuilder();
        for (int i = input.length() - 1; i >= 0; i--) {
            reversed.append(input.charAt(i));
        }
        return reversed.toString();
    }

    public static String repeatString(String input, int count) {
        StringBuilder result = new StringBuilder();
        for (int i = 0; i < count; i++) {
            result.append(input);
        }
        return result.toString();
    }

    public static int sumArray(int[] array) {
        int sum = 0;
        for (int value : array) {
            sum += value;
        }
        return sum;
    }

    public static int[] squareArray(int[] array) {
        int[] squares = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            squares[i] = array[i] * array[i];
        }
        return squares;
    }

    public static void main(String[] args) {
        printGreeting("Иван");
        int[] array = {1, 2, 3};
        displayArray(array);
        System.out.println(findMax(new int[]{4, 1, 7, 2}));
        System.out.println(countVowels("Привет"));
        System.out.println(calculateAverage(new int[]{1, 2, 3, 4, 5}));
        System.out.println(fahrenheitToCelsius(98.6));
        System.out.println(reverseString("Привет"));
        System.out.println(repeatString("Java", 3));
        System.out.println(sumArray(new int[]{1, 2, 3, 4}));
        int[] squares = squareArray(new int[]{1, 2, 3, 4});
        for (int square : squares) {
            System.out.print(square + " ");
        }
    }
}