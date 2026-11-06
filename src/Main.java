public class Main {
    public static void main(String[] args) {
        parseAndPrintNumber("64");
        parseAndPrintNumber("111");
    }

    public static void parseAndPrintNumber(String number) {

        int num = Integer.parseInt(number);
        System.out.println(num / 2);
    }
}