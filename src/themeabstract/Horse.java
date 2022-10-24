package themeabstract;

public abstract class Horse {
    // абстрактный метод
    abstract void neigh();

    // абстрактный класс модет и обычный метод содержать!
    void gallop() {
        System.out.println("Kuda prew gallopom??!");
    }
	
	

}

class HorseInVacuum extends Horse {
    
    void neigh() {
        System.out.println("New Kuda prew a?!");
    };
}
