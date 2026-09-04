public class Main {
    public static void main(String[] args) {
        int[] a = {1, 3, 7, 5};
        int[] b = {8, 4, 2, 4};
        int[] res = mergeAndSort(a, b);
        for (int i = 0; i < res.length; i++) {
            System.out.println(res[i] + "");
        }
    }

    public static int[] mergeAndSort(int[] first, int[] second) {
        int[] merged = new int[first.length + second.length];
        for (int i = 0; i < first.length; i++) {
            merged[i] = first[i];
        }
        for (int i = 0; i < second.length; i++) {
            merged[first.length + i] = second[i];
        }
        for (int i = 0; i < merged.length; i++) {
            for (int j = i + 1; j < merged.length; j++) {
                if (merged[i] > merged[j]) {
                    int temp = merged[i];
                    merged[i] = merged[j];
                    merged[j] = temp;
                }
            }
        }
        return merged;
    }
}