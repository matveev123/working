public class Test3 {
    public static void main(String[]args) {
        //A a = new B();
        //a.m1(1);
        A a = new B();// только так!
        //B b = (B)a;// по-другому нельзя!
		//System.out.println(b.number);// доступ есть и к тому и к тому
		a.m1(1);
        //int mas[] = nums;
    }
}

class A {
    public int numberA = 123;
    static void m1(int i) {
        System.out.println("A");

    }
}
class B extends A {
	public int number = 0;
    static void m1(int i) {
        System.out.println("B");
    }
}
