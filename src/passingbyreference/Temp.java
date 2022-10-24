import java.util. * ;
public class Temp {
	void modify(int i){
		i++;
	}
    public static void main(String[]args) {
		int i = 123;
		new Temp().modify(i);
		System.out.println(i);//123
        ArrayList < String > fruits = new ArrayList < String > (Arrays.asList("Apple", "Mango", "Grapes"));
        System.out.println("Before processData " + Arrays.toString(fruits.toArray()));
        processData(fruits);
        System.out.println("After processData " + Arrays.toString(fruits.toArray()));
    }

    public static void processData(ArrayList < String > fruitsRef) { //fruitsRef
        //fruitsRef = new ArrayList<>(fruitsRef);
        fruitsRef.add("Orange");
    }
}
