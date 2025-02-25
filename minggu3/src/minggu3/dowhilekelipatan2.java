package minggu3;

public class dowhilekelipatan2 {
    public static void main(String[] args) {
        System.out.println("        Do_While        ");
        System.out.println("Bilangan Kelipatan 2 (1 - 100)");
        System.out.println("==============================");
        
        int i = 1;
        do {            
            System.out.print(i + " ");
            i = i * 2;
        } while (i <= 100);
    }
}
