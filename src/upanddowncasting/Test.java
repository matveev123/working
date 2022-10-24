public class Test {
    public static void main(String[]args) {
        Dog d = new Dog();
        Animal a = (Animal)d;
        d.called();
        a.called();
        ((Dog)a).called2();
    }
}

class Animal {
    public void called() {
        System.out.println("Animal");
    }
}

class Dog extends Animal {

    public void called2() {
        System.out.println("Called2");
    }
    public void called() {
        System.out.println("Dog");
    }
}
