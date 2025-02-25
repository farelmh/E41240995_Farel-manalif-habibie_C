package minggu3;

import java.util.Scanner;

public class tugas2 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah deret: ");
        int baris = input.nextInt();
        int[] arr = new int[baris];

        for (int i = 0; i < baris; i++) {
            System.out.print("Masukkan angka pada deret ke-" + (i+1) + " : ");
            arr[i] = input.nextInt();
        }
        //tampilkan deret
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
