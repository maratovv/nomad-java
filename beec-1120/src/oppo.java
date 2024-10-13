import java.util.Scanner;

public class oppo {

    public static void main(String[] args) {
        Scanner numberInput = new Scanner(System.in);

        while (true) {
            String brokenDigit = numberInput.next();
            String originalNumber = numberInput.next();

            if (brokenDigit.equals("0") && originalNumber.equals("0")) {
                break;
            }

            String resultAfterRemoval = originalNumber.replace(brokenDigit, "");

            resultAfterRemoval = resultAfterRemoval.replaceFirst("^0+", "");

            if (resultAfterRemoval.isEmpty()) {
                resultAfterRemoval = "0";
            }

            System.out.println(resultAfterRemoval);
        }

        numberInput.close();
    }
}