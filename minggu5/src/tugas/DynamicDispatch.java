package tugas;

class A {
    void callthis() {
        System.out.println("Inside class A's method");
    }
}
class B extends A {
    void callthis() {
        System.out.println("Inside class B's method");
    }
}
class C extends B {
    void callthis() {
        System.out.println("Inside class C's method");
    }
}
public class DynamicDispatch {
    public static void main(String[] args) {
        A a = new A();
        B b = new B();
        C c = new C();
        A ref;
        
        ref = b;
        ref.callthis();
        
        ref = c;
        ref.callthis();
        
        ref = a;
        ref.callthis();
    }
}
