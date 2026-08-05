public class Main {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
        printArray(arr);
        int[] empty = {};
        printArray(empty);
    }
    public static void printArray(int[] numbers) {
        System.out.print("[");
    for (int i = 0; i < numbers.length; i++) {
        System.out.print(numbers[i]);
        if (i < numbers.length - 1){
            System.out.print(", ");
        }
    }
        System.out.print("]");
    }
}