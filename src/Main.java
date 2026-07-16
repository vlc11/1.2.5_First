public class Main {
    public static void main(String[] args) {
        System.out.println(isWeekend(1));
        System.out.println(isWeekend(6));
    }
    public static boolean isWeekend(int weekDayNumber) {
        if (weekDayNumber == 6 || weekDayNumber == 7){
            return true;
        } else {
                return false;
        }
    }
}