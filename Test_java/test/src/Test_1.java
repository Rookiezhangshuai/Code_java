import java.math.BigInteger;
import java.util.Scanner;

public class Test_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String m = sc.nextLine();
        int count = 0;
        while (count++ <= 30) {
            String sum = addNaryNumbers(m, Reverse(m), n);
            m = sum;
            if (isPalindrome(sum)) {
                System.out.println("STEP=" + count);
                return;
            }
        }
        System.out.println("Impossible!");
    }

    public static String Reverse(String m) {
        StringBuilder reversed = new StringBuilder(m).reverse();
        return reversed.toString();
    }

    public static boolean isPalindrome(String m) {
        int i = 0, j = m.length() - 1;
        while (i < j) {
            if (m.charAt(i++) != m.charAt(j--)) {
                return false;
            }
        }
        return true;
    }

    public static String addNaryNumbers(String num1, String num2, int n) {
        BigInteger number1 = new BigInteger(num1, n);
        BigInteger number2 = new BigInteger(num2, n);
        BigInteger result = number1.add(number2);
        return result.toString(n);
    }
}
