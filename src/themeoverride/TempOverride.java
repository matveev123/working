//package themeoverride;


class TempOverride {
    public static void main(String[]args) {
        A a = new A();
        a.a(1, "1");
        a.a("1", 1);
    }
}

class A {
    void a(int i, String str) {
        System.out.println("1");
    }

    void a(String str, int i) {
        System.out.println("1");
    }

    /*int a(int i, String str) { /// <- int !Eroor!
    System.out.println("1");
    return 0;
    }*/

}
