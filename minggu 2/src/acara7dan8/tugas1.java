package acara7dan8;
import java.util.Scanner;
public class tugas1 {
    public static void main(String[] args) {
        String nama;
        double harga;
        double total = 0, jumlah = 5;
        Scanner scan = new Scanner(System.in);

        System.out.println("----------------------------------------------------");
        System.out.println("            Kharisma Agung Plaza < KAP >            ");
        System.out.println("              Promo Belanja Berhadiah               ");
        System.out.println("          Khusus Pembelian 5 Barang Pertama         ");
        System.out.println("          Dengan Harga Minimum Rp 100000,00         ");
        System.out.println("----------------------------------------------------");

        System.out.print("Masukkan nama anda: ");
        nama = scan.nextLine();
        System.out.println("");

        for (int i = 1; i <= jumlah; i++) {
            System.out.print("Masukkan harga barang ke-" + i + "    : ");
            harga = scan.nextDouble();
            total += harga;
        }
        System.out.println("total harga pembelian atas nama " + nama + " adalah Rp " + total + "\n");
        if (total >= 100000) {
            System.out.println("Selamat...");
            System.out.println("Anda Mendapatkan 1 hadiah mug cantik\n");
        }
        System.out.println("----------------------------------------------------");
        System.out.println("                    Terima Kasih                    ");
        System.out.println("    Anda sudah berbelanja di Kharisma Agung Plaza   ");
    }
}
