class Parent {
    public String name = "ParentClass";

    public void displayName() {
        System.out.println(name);
    }
}

class Child extends Parent {
    public String name = "ChildClass";

    @Override
    public void displayName() {
        System.out.println(name);
    }
}

public class Main {
    public static void main(String[] args) {
        Parent childAsParent = new Child();
        
        System.out.println(childAsParent.name); 

        childAsParent.displayName();
    }
}