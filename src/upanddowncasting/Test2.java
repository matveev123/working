public class Test2 {

    public Object getObject(Object o) {
        return o;
    }

    public static void main(String[]args) {
        //A a = new C(); // A c1 = new C();
        //a.m1(new B()); // c1.m1(new B());
		Object o = new Test2().getObject(new Test2()); //(Object o <-> Test2 o) нельзя
		
    }

    class A {
        void m1(A a) {
            System.out.println("A");
        }
    }
    class B extends A {
        void m1(B b) {
            System.out.println("B");
        }
    }
    class C extends B {
        void m1(B c) {
            System.out.println("C");
        }
    }
}
