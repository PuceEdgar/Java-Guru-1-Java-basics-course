package lesson3.AmericanCardChecker;

public class AmericanCardChecker {

    String isAmerican (String number) {

        int length = number.length();
        boolean isValidLength = length == 15;
        boolean hasValidPrefix = number.startsWith("34") || number.startsWith("37");

        if (isValidLength && hasValidPrefix) {

            return " is valid American Express card";

        }
        return " is NOT a valid American Express card";

    }
}
