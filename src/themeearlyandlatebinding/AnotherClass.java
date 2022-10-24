public class AnotherClass {
    public static class animal {
        public void eat() {
            System.out.println("");
        }
    }
    public static class dog extends animal {
        public void eat() {
            System.out.println("eat bread");
        }
    }
    public static class cat extends animal {
        public void eat() {
            System.out.println("eat rat");
        }
    }
    public static class lion extends animal {
        public void eat() {
            System.out.println("eat meal");
        }
    }
    public static void main(String[]args) {
        animal obj;
        obj = new Dog();
        obj.eat();
        obj = new cat();
        obj.eat();
        obj = new lion()
            obj.eat();
    }

}
//Тип объекта не может быть определен компилятором, поскольку экземпляр Dog также является экземпляром Animal
//Таким образом, компилятор не знает его тип, только его базовый тип.
