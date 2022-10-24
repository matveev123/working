public class Temp{
	public static void main(String[]args){
		Child child = new Child();
		Parent parent = child;
		child.m();
		parent.m();
		
	}
}

class Parent{
	void m(){
		System.out.println("from A");
	}
}
class Child extends Parent{
	void m(){
		System.out.println("from B");
	}
}