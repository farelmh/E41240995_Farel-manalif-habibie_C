package pewarisan;

public class pelajar extends orang {
    private String nim;
    private String asalSekolah;
    private double nilai;
    
    public pelajar(String nama, double tinggi, double berat, String nim, String asalSekolah, double nilai) {
        super(nama, tinggi, berat);
        this.nim = nim;
        this.asalSekolah = asalSekolah;
        this.nilai = nilai;
    }
    public String toString() {
        return (super.toString() + "\nNim : " + nim + "\nAsal Sekolah : " + asalSekolah + "\nNilai : " + nilai);
    }
}
