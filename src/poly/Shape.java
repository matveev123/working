public class Shape {
    void draw() {
        System.out.println("Shape draw");
    }

    void erase() {
        System.out.println("Shape erase");
    }

    static void doSomething(Shape shape) {
        shape.erase();
        shape.draw();
    }

    public static void main(String[]args) {
        Shape shape = new Shape();
		Shape.doSomething(new Circle());
		Shape.doSomething(new Triangle());
		

    }

}

class Circle extends Shape {
    void draw() {
        System.out.println("Circle draw");
    }

    void erase() {
        System.out.println("Circle erase");
    }
}
class Triangle extends Shape {
    void draw() {
        System.out.println("Triangle draw");
    }

    void erase() {
        System.out.println("Triangle erase");
    }
}
