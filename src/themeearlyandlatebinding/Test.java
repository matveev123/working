import java.util. * ;
public class Test {
    public static void main(String[]args) {
        A ptr = new A();
        System.out.println(ptr.get());
        ptr = new B();
        System.out.println(ptr.get());
    }

}
class A {
    int i = 1;
    int get() {
        return i;
    }
}
class B extends A {
    int a = 0;
    int get() {
        return a;
    }
}
