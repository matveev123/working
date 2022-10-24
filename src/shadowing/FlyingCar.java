public class FlyingCar implements FlyCar, OperatorCar {
    
/*     public String startEngine(String key) {
        
        System.out.println("1");
        return key;
    } */
	
	//FlyCar.super.startEngine(key);
        //OperateCar.super.startEngine(key);
	
	public static void main(String[]args) {
		FlyingCar flyingcar = new FlyingCar();
		flyingcar.startEngine("1");
	}
}
