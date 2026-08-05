import java.util.Arrays;
public class Main {
public static void main(String[] args) {
    int[] arr = {1, 3, 5, 6, 9, 11, 24};
    System.out.println(Arrays.toString(getSubArrayBetween(arr, 4, 10)));
}
    public static int[] getSubArrayBetween(int[] numbers, int start, int end) {
        return Arrays.stream(numbers)
                .filter(n -> n >= start && n <= end)
                .toArray();
    }
}
