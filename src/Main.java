public class Main {
    public static void main(String[] args) {
        Main obj = new Main();
        System.out.println(obj.drawsMonitorsCounter(10, 3));
    }

    public int drawsMonitorsCounter(int monitors, int programmers) {
        return monitors % programmers;
    }
}
