package overriding;

public class B extends A {
    public void tampilkanKeLayar() {
        super.tampilkanKeLayar();
        System.out.println("Method milik class B dipanggil ...");
    }
}
