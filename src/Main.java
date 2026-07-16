public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend("Monday"));
        System.out.println(isWeekend("Sunday"));
    }
    public static boolean isWeekend(String weekday) {
    switch (weekday) {
        case "Saturday":
        case "Sunday":
                         return true;
        default:
            return false;
    }
    }
}