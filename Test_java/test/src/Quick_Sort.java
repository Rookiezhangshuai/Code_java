public class Quick_Sort {
    public static void main(String[] args) {
        int[] arr = {4, 7, 4, 2, 1, 9, 8, 6};
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
        quicksort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }

    public static void quicksort(int[] arr) {
        if (arr == null || arr.length < 2) {
            return;
        } else {
            quicksort(arr, 0, arr.length - 1);
        }
    }

    public static void quicksort(int[] arr, int left, int right) {
        if (left < right) {
            swap(arr, left + (int) (Math.random() * (right - left + 1)), right);
            int[] p = partition(arr, left, right);
            quicksort(arr, left, p[0] - 1);
            quicksort(arr, p[1] + 1, right);
        }
    }

    public static int[] partition(int[] arr, int L, int R) {
        int less = L - 1;
        int more = R;
        while (L < more) {
            if (arr[L] < arr[R]) {
                swap(arr, ++less, L++);
            } else if (arr[L] > arr[R]) {
                swap(arr, --more, L);
            } else {
                L++;
            }
        }
        swap(arr, more, R);
        return new int[]{less + 1, more};
    }

    public static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
