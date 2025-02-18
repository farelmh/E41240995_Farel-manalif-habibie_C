package acara7dan8;
import java.util.Scanner;

public class tugas2 {
    public static void main(String[] args) {
        String nama;
        String menu = "";
        int pilihan;
        Scanner scan = new Scanner(System.in);
        
        System.out.println("        CAFE CERIA       ");
        System.out.println("      ANEKA MINUMAN      ");
        System.out.println("-------------------------");
        System.out.println("      SPECIAL MENU       ");
        System.out.println("    1.  Soft Drinks      ");
        System.out.println("    2.  Milk juice       ");
        System.out.println("    3.  Nescafe          ");
        System.out.println("    4.  Soda milk        ");
        System.out.println("    5.  Tea              ");
        System.out.println("-------------------------");

        System.out.print("Masukkan nama pembeli : ");
        nama = scan.nextLine();
        System.out.println("");

        System.out.print("Silahkan masukkan pilihan anda : ");
        pilihan = scan.nextInt();

        switch (pilihan) {
            case 1:
                menu = "Soft drinks";
                break;
            case 2:
                menu = "Milk juice";
                break;
            case 3:
                menu = "Nescafe";
                break;
            case 4:
                menu = "Soda milk";
                break;
            case 5:
                menu = "Tea";
                break;
            default:
                menu = "tidak terdaftar";
        }

        System.out.println("Minuman yang anda pesan adalah " + menu);
        System.out.println("Pesanan akan segera kami antar");
        System.out.println("Terima kasih " + nama + " telah berkunjung di Cafe Ceria");
    }
}