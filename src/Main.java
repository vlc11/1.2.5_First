// задача 1: без Arrays
public class Main {
    public static void main(String[] args) {
        int[] arr1 = {1, 5, 2, 17};
        int[] mid1 = middle(arr1);
        for (int i = 0; i < mid1.length; i++) {
            System.out.println(mid1[i] + "");
        }
        System.out.println();
        int [] arr2 = {14, 16, 3};
        int [] mid2 = middle(arr2);
        for (int i = 0; i < mid2.length; i++){
            System.out.println(mid2[i] + "");
        }
    }

    public static int[] middle(int[] numbers) {
    int len = numbers.length;
    int mid = len / 2;
    if (len % 2 == 0) {
        int[] result = new int[2];
        result[0] = numbers [mid -1];
        result[1] = numbers [mid];
        return result;
    } else {
        int[] result = new int[1];
        result[0] = numbers [mid];
        return result;
    }


    }
}