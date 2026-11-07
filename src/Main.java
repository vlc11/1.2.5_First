public class Main {
    public static void main(String[] args) {
        System.out.println(isPalindrome("Was it a cat I saw ?"));
    }

    public static boolean isPalindrome(String text) {
        String clean = text.toLowerCase().replaceAll("[^a-z0-9]", "");
        String reversed = new StringBuilder(clean).reverse().toString();
        return clean.equals(reversed);
    }

}