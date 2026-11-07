public class Main {
    public static void main(String[] args) {
        System.out.println(isGmailOrOutlook("kata12@gmail.com"));
        System.out.println(isGmailOrOutlook("@outlook.com"));
    }

    public static boolean isGmailOrOutlook(String email) {
        return email.matches("[a-zA-Z0-9]+@(gmail|outlook)\\.com");
    }
}