import java.util.Arrays;
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 2, 17};
        System.out.println(Arrays.toString(middle(arr1)));
        int [] arr2 = {14, 16, 3};
        System.out.println(Arrays.toString(middle(arr2)));
    }
    public static int[] middle(int[] numbers) {
        int mid = numbers.length / 2;
        if (numbers.length % 2 == 0){
            return Arrays.copyOfRange(numbers, mid - 1, mid +1);
        } else {
            return Arrays.copyOfRange(numbers, mid, mid +1);
        }
    }
}