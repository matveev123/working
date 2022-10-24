package themeabstract;

class Duck implements Swimmable {// реализует
    int dim1;
    int dim2;

    public void swim(){
		System.out.println("Уточка плыви!");
	}
	
	public static void main(String []args){
		Duck duck = new Duck();
		duck.swim();
	}
}
