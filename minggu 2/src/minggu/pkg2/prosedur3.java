package minggu.pkg2;

class book {

    int price;
    int pages;

    public void set(int price, int pages) {
        this.price = price;
        this.pages = pages;
    }

    public void show() {
        System.out.println("book indormation");
        System.out.println("book prices : " + price);
        System.out.println("number of pages : " + pages);
    }

}

public class prosedur3 {

    public static void main(String[] args) {
        book javabook = new book();
        javabook.set(60000, 100);
        javabook.show();
    }

}
