package src.composition;

class CarEngine {
    //private String type;
    public void startEngine() {
        System.out.println("the carengine has started");
    };
    public void stopEngine() {
        System.out.println("the carengine has stopped");
    };
}

class Car {
    private String colour;
    private int max_Speed;

    public void carDetails() {
        System.out.println("Car colour : " + colour + " \n Max speed" + max_Speed);
    }
    public void setColour(String colour) {
        this.colour = colour;
    }
    public void setMaxSpeed(int max_Speed) {
        this.max_Speed = max_Speed;
    }
}

class Honda extends Car {
    public void hondaStart() {
        //Honda honda = new Car(honda);
        CarEngine hondaenhgine = new CarEngine(); // composition
        hondaenhgine.startEngine();
    }

}
// Assotiation()
// 			Aggregation("has-a") - обладает - 
// 					Compostion("has-a") - обладает
// Instance - "is a"

public class Main {
    //private final Engine engine;
    //public Car {
    //    engine = new Engine();
    //}
    public static void main(String[]args) {
        Honda hondaJazz = new Honda();
        hondaJazz.setColour("Black");
        hondaJazz.setMaxSpeed(160);
        hondaJazz.carDetails();
        hondaJazz.hondaStart();
        //hondaJazz.stopEngine();

    }
}
class Library {
    Book book;
    Library(Book book) {
        this.book = book;
    }
}
class Book {}
