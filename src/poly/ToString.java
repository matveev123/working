public class ToString {
    public static void main(String[]args) {
        Child child = new Child();
        Object myObject = child;//upcasting
        System.out.println(child);
        System.out.println(myObject);
		
		/* Child child = new Child();
		Parent parent = child;
		child.m();
		parent.m(); */
    }
}
class Child {
    private int age = 123;
	
    @Override
    public String toString() {
        return "age is " + age;
    }
}
