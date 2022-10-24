public class Robot {
    private double x = 0;
    private double y = 0;
    protected double course;

    // робот управляется оператором
    Operator operator;

    Robot(double x, double y) {
        this.x = x;
        this.y = y;

    }

    public Operator getOperator() {
        return operator;
    }
    public void setOperator(Operator operator) {
        this.operator = operator;
    }

    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }

    public void forward() {
        x = x + distance * Math.cos(course / 180 * Math.PI);
        y = y + distance * Math.sin(course / 180 * Math.PI);
    }

    public double getCourse() {
        return course;
    }
    public void setCourse(double course) {
        this.course = course;
    }

    public void printCoordinates() {
        System.out.println(x + "," + y);
    }

}
class Operator {
    private String firstName;
    private String lastName;

    // оператор управляет конкретным роботом
    private Robot robot;

    Operator(double firstName, double lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    public void setRobot(Robot robot) {
        this.robot = robor;
    }
    public Robot getRobot() {
        return robot;
    }
}

class Main {
    public static void main(String[]args) {
        System.out.println("Sense!");
    }
}
