import java.util.Objects;
import java.util.concurrent.atomic.*;
enum Color { RED, ORANGE, YELLOW, GREEN, BLUE, INDIGO, VIOLET }
public class Temp {
    String str;
    Temp(String str) {
        this.str = str;
    }
    boolean m(Temp temp) {
        System.out.print(this + " " + this.str); //+ "\n" + temp.str
        //+ this.str
        return true;
    }
    public static void main(String[]args) {

        /* Temp temp = new Temp("from temp");
        Temp temp1 = new Temp("from temp1");
        System.out.println(temp.equals(temp));
        System.out.println("Sex" == "Sex"); */
        //Objects.requireNonNull("1");
		
		
        /* A a = new A();
        B b = new B();
        System.out.println(a instanceof B);
     */
	Point point = new Point(1,2);
	CounterPoint counterPoint = new CounterPoint(1,2);
	//System.out.println(point.getClass() == counterPoint.getClass());
	//System.out.println(point.getClass() == counterPoint.getClass());
	
	ColorPoint p1 = new ColorPoint(1, 2, "red");
	Point p2 = new Point(1, 2);
	ColorPoint p3 = new ColorPoint(1, 2, "blue");
	System.out.println(p1.getClass());
	System.out.println(counterPoint.getClass());
	System.out.println(p2.getClass() + "\n");
	System.out.println(p1.getClass() == p2.getClass());
	
	}
}

class A {}
class B extends A {}

class Point{
	private final int x;
    private final int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }
	
	   // Broken - violates Liskov substitution principle (page 43)
/*    @Override public boolean equals(Object o) {
       if (o == null || o.getClass() != getClass())
           return false;
       Point p = (Point) o;
       return p.x == x && p.y == y;
   } */
}



class ColorPoint extends Point {
    private final String color;

    ColorPoint(int x, int y, String color) {
        super(x, y);
        this.color = color;
    }
}
class CounterPoint extends Point {
    private final Point point;

    public CounterPoint(int x, int y, color) {
        super(x, y);
		this.color = Objects.requireNonNull(color);
    }
	
	//public metgod
	
	
       @Override public boolean equals(Object o) {
       if (!( instanceof ColorPoint))
           return false;
	   
       ColorPoint cp = (ColorPoint) o;
       return cp.point.equals(point)  &&  cp.color(color);
   }
}