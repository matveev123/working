class Operation {
    int square(int n) {
        return n * n;
    }
}
class Circle {
    double pi = 3.14;
    Operation op; // aggregation

    double area(int radius) {
        op = new Operation();
        int rsSquare = op.square(radius); //code reuseability(i.e. delegates method call)
        return pi * rsSquare;
    }
	
	public static void main(String[]args) {
        Circle c = new Circle();
        double result = c.area(5);

        System.out.println(result);
    }
}

class Main {
    

}
