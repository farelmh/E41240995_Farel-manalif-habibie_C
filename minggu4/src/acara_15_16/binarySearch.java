package acara_15_16;

public class binarySearch {
    public static void main(String[] args) {
        int[] arr = {1, 5, 9, 20, 33, 45, 67, 73, 81};
        int x = 67;

        int hasil = binarySearch(arr, x);
        if (hasil != -1) {
            System.out.println("Bilangan ditemukan pada index " + hasil + " pada array");
        } else {
            System.out.println("Bilangan tidak ditemukan");
        }
    }

    public static int binarySearch(int[] arr, int x) {
        int low = 0;
        int high = arr.length - 1;

        while (low <= high) {
            int mid = low + (high - low) / 2;

            if (arr[mid] == x) {
                return mid;
            }
            if (arr[mid] < x) {
                low = mid + 1;
            } else {
                high = mid - 1;
            }
        }
        return -1;
    }
}
