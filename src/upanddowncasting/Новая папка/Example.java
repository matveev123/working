public class Example {
    public static void main(String[]args) {

        //Parent p = new Child();
        p.method();
		Parent p = new Parent();

    }
}

class Parent {
    String name;
	

    static void method() {
        System.out.println("From parent class");
    }
}
class Child extends Parent {
    int id;

    void method() {
        System.out.println("From child class");
    }
}
