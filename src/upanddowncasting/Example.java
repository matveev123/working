public class Example {
    public static void main(String[]args) {
        //Upcasting
        // гибкий доступ к членам родительского класса и не ко всем членам дочернего(только к специальным!)
        Parent p = new Child();
        //p.id = 1;
        p.name = "GFG";
        p.method(); //override
        //Downcasting
        //Child c = new Parent() or (Child)new Parent(); <- ClassCastException
        Child c = (Child)p; //p
        c.id = 1;
        c.name = "1" ;; //GFG
        c.method(); //from child new; Child()

    }
}

class Parent {
    String name;

    void method() {
        System.out.println("From parent class");
    }
}
class Child extends Parent {
    int id;

    void method() {
        System.out.println("From child class");
    }
}
