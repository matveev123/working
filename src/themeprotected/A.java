package themeprotected;
import themeprotected.mypackage.C ;
class A extends C {

    protected String sasha = "sasha";

    A(String str) {
        super(str);
    }

    public static void main(String[]args) {
        System.out.println(new A("iLyA").ilya);
    }
}
