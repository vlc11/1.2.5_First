public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("hello"));
    }

    public static boolean isPalindrome(String text) {
        String clean = text.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }
}