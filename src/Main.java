public class Main {
    public static boolean isWeekend(String dayName) {
        return dayName.equals("Saturday") || dayName.equals("Sunday");
    }

    public static int weekendCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (isWeekend(day)) {
                count++;
            }
        }
        return count;
    }

    public static int weekdayCount(String[] days) {
        int count = 0;
        for (String day : days) {
            if (!isWeekend(day)) {
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        String[] days = {"Monday", "Saturday", "Wednesday", "Sunday", "Friday"};
        System.out.println(isWeekend("Saturday"));
        System.out.println(isWeekend("Monday"));
        System.out.println(weekendCount(days));
        System.out.println(weekdayCount(days));
    }
}