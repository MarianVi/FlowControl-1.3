import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TO DO:

        int n = scanner.nextInt();

// 13.1
        boolean containsOddDigits = false;
// 13.2
        int noOddDigits = 0, noEvenDigits = 0;
// 13.3
        int sum = 0;
// 13.4
        int nC = 0;
// 13.5
        boolean contains9 = false;
//13.6
        boolean lastDigit = false;
        int nCopy = n;
//13.7
        boolean oneDigitNumber = false;
//13.8
        boolean contains1or0 = false;
        int cifra0 = 0;
        int cifra1 = 0;

        while (n != 0) {
            int uC = n % 10;

            // 13.1
            if (uC % 2 == 1) {
                containsOddDigits = true;
            }

            // 13.2
            if (uC % 2 == 0) {
                noEvenDigits++;
            } else {
                noOddDigits++;
            }

            // 13.3
            sum += uC;

            // 13.4
            nC++;

            // 13.5
            if (uC == 9) {
                contains9 = true;
            }

            //13.8
            if (uC == 0) {
                cifra0++;
            } else if (uC == 1) {
                cifra1++;
            }
            if (cifra0 != 0 && cifra1 != 0) {
                contains1or0 = true;
            }
            n /= 10;
        }
        //13.6
        if (nCopy % 10 == 3 || nCopy % 10 == 7 || nCopy % 10 == 9) {
            lastDigit = true;
        }
        //13.7
        if (nCopy >= 0 && nCopy <= 9) {
            oneDigitNumber = true;
        }

// 13.1
        System.out.println("Contine numai cifre pare? R: " + (!containsOddDigits));

// 13.2
        System.out.println("Contine mai multe cifre pare decat cifre impare? R: "
                + (noEvenDigits > noOddDigits));

// 13.3
        System.out.println("Suma cifrelor sale este divizibila cu 5? R: " + (sum % 5 == 0));

// 13.4
        System.out.println("Numarul de cifre este multiplu de 3? R: " + (nC % 3 == 0));

// 13.5
        System.out.println("Numarul contine cifra 9? R: " + contains9);

// 13.6
        System.out.println("Numarul se termina in oricare dintre cifrele 3, 7 sau 9? R: " + lastDigit);

// 13.7
        System.out.println("Numarul este o cifra? R: " + oneDigitNumber);

// 13.8
        System.out.println("Numarul contine cifra 1 si cifra 0? R: " + contains1or0);
    }
}
