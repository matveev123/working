public class Task {
    public static void main(String[]args) {

        A c1 = new C(); // A
        c1.m1(new B());
         

       /*  A c1 = new B(); // B
        c1.m1(new B()); */
    }

}

class A {

    void m1(A a) { // доступ ТОЛЬКО в Parent class
        System.out.println("A");
    }
}
class B extends A {
    void m1(B b) { // перегрузка
        System.out.println("B");
    }
}
class C extends B {
    void m1(B c) { // перегрузка
        System.out.println("C");
    }
}

/*class A {
    void m1(A a) {
        System.out.println("from A");
        a.print();
    }
    void print() {
        System.out.print("A");
    }
}
class B extends A {
    void m1(B b) { //overload-перегрузка
        // тело не влияет
    }

    void print() {
        System.out.print("B");
    }
}*/