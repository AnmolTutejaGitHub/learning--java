public class checking_copilot {
    public static void main(String[] args) {
        int[] arr = { 1, 3, 5, 7, 2, 71, 1 };
        arr = mergeSort(arr);
        for (int i : arr) {
            System.out.print(i + " ");
        }
    }

    public static int[] mergeSort(int[] arr) {
        if (arr.length <= 1) {
            return arr;
        }
        int mid = arr.length / 2;
        int[] left = new int[mid];
        int[] right = new int[arr.length - mid];
        for (int i = 0; i < mid; i++) {
            left[i] = arr[i];
        }
        for (int i = mid; i < arr.length; i++) {
            right[i - mid] = arr[i];
        }
        left = mergeSort(left);
        right = mergeSort(right);
        return merge(left, right);
    }

    public static int[] merge(int[] left, int[] right) {
        int[] result = new int[left.length + right.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while (i < left.length && j < right.length) {
            if (left[i] < right[j]) {
                result[k] = left[i];
                i++;
                k++;
            } else {
                result[k] = right[j];
                j++;
                k++;
            }
        }
        while (i < left.length) {
            result[k] = left[i];
            i++;
            k++;
        }
        while (j < right.length) {
            result[k] = right[j];
            j++;
            k++;
        }
        return result;
    }
}
