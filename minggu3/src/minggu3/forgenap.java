package minggu3;
import java.util.Scanner;

public class forgenap {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Masukkan Bilangan Genap Awal: ");
        int bil1 = input.nextInt();
        
        System.out.print("Masukkan Bilangan Genap Akhir: ");
        int bil2 = input.nextInt();
        
        for (int i = bil1; i <= bil2; i += 2) {
            System.out.print(i + " ");
        }    
    }
}
