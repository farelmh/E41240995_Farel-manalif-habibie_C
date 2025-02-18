package minggu.pkg2;

public class ManagingPeople {

    public static void main(String[] args) {
        Person p1 = new Person("Arial", 37);
        Person p2 = new Person("Joseph", 15);

        if (p1.getAge() == p2.getAge()) {
            System.out.println(p1.getName() + " is the same as " + p2.getName());
        } else {
            System.out.println(p1.getName() + " is not the same as " + p2.getName());
        }
    }
}
