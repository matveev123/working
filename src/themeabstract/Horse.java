package themeabstract;

public abstract class Horse {
    // ����������� �����
    abstract void neigh();

    // ����������� ����� ����� � ������� ����� ���������!
    void gallop() {
        System.out.println("Kuda prew gallopom??!");
    }
	
	

}

class HorseInVacuum extends Horse {
    
    void neigh() {
        System.out.println("New Kuda prew a?!");
    };
}
