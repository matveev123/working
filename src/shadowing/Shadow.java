public class Shadow {
    public static void main(String[]args) {
		A a = new B();
		//a.f();
		A test;
		test.f();
		
	}
}

class A {
    public static void f() {
        System.out.println("from A");
    }

}
class B extends A {
    public static void f() {
        System.out.println("from B");
    }
}
