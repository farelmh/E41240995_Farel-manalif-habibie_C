package acara7dan8;

import java.util.Scanner;

public class prosedur2 {

    public static void main(String[] args) {
        String lampu;
        Scanner scan = new Scanner(System.in);

        System.out.print("Inputkan nama warna: ");
        lampu = scan.nextLine();

        switch (lampu) {
            case "merah":
                System.out.println("lampu merah, berhenti");
                break;
            case "kuning":
                System.out.println("lampu kuning, harap hati - hati");
                break;
            case "hijau":
                System.out.println("lampu hijau, silahkan jalan");
                break;
            default:
                System.out.println("warna lampu salah");

        }
    }
}