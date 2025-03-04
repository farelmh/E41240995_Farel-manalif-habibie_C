package acara_13_14;
import java.util.Arrays;

public class selectionSort {
    public static void selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int min = i;

            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }

            int temp = arr[min];
            arr[min] = arr[i];
            arr[i] = temp;
        }
    }

    public static void main(String[] args) {
        int[] data = {3, 60, 35, 2, 45, 320, 5};
        System.out.println("Array sebelum diurutkan: " + Arrays.toString(data));

        selectionSort(data);

        System.out.println("Array setelah diurutkan: " + Arrays.toString(data));
    }
}
