import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
    System.out.println(Arrays.toString(mergeAndSort(
            new int[]{1, 3, 7, 5}, new int[]{8, 4, 2, 4})));
}
public static int[] mergeAndSort(int[] first, int[] second) {
    int[] merged = Arrays.copyOf(first, first.length + second.length);
    System.arraycopy(second, 0, merged,first.length, second.length);
    Arrays.sort(merged);
    return merged;
}
}