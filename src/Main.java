import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger a = factorial(1);
        System.out.println(a);
        BigInteger b = factorial(3);
        System.out.println(b);
        BigInteger c = factorial(5);
        System.out.println(c);
    }
    public static BigInteger factorial(int value) {
        BigInteger result = BigInteger.valueOf(1);
        for (int i = 1; i <= value; i++) {
            BigInteger current = BigInteger.valueOf(i);
            result = result.multiply(current);
        }
        return result;
    }
    }