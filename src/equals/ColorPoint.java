import java.util.Objects ;

public class ColorPoint {
    private final Point point;
    private final Color color;

    ColorPoint(int x, int y, Color color) {
        point = new Point(x,y);
		//without Point but point = new Point(x,y);
        this.color = Objects.requireNonNull(color);
    }

    public Point asPoint() {
        return point;
    }

    @Override
    public boolean equals(Object o) {
        if (!(o instanceof ColorPoint))
            return false;
        ColorPoint cp = (ColorPoint)o;
        return cp.point.equals(point) && cp.color.equals(color);
    }
    public static void main(String[]args) {
        ColorPoint cpR = new ColorPoint(1, 2, Color.RED);// Color.!!!
        ColorPoint cpG = new ColorPoint(1, 2, Color.GREEN);// Color.!!!
        ColorPoint cpB = new ColorPoint(1, 2, Color.BLUE);// Color. !!!
        Point p = new Point(1, 2);

        System.out.println(p.equals(cpR));
        System.out.println(cpG.equals(cpR));
        System.out.println(cpG.equals(cpG));
        System.out.println(cpG.equals(p));
    }
}


