public class Main {
    public static void main(String[] args) {
        int[] arr = {3,5,20,8,7,3,100};
        printOddNumberrs(arr);
    }
    public static void printOddNumberrs(int[] arr) {
    for (int i = 0; i < arr.length; i++) {
    if (arr[i] % 2 != 0) {
        System.out.println(arr[i]);
        if (i < arr.length - 1) {
            System.out.println(",");
        }
    }
    }
    }
}