package themeabstract;

abstract class Figure {
    int dim1;
    int dim2;
    String nameF = "Figure";

    Figure(int a, int b) {
        dim1 = a;
        dim2 = b;
    }

    //abstract int area();
    int area() {
        return 543;
    }
}
