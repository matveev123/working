//package themeearlyandlatebinding;
public class NewClass {
    public static class bike {
        void run() {
            System.out.println("run");
        };
    }
    public static class spendor extends bike {
         @ Override
        void run() {
            System.out.println("run in 60 km/h");
        };
    }

    public static void main(String[]args) {
        bike b = new spendor(); //upcast
        b.run();// dynamic dispatch/late binding/polymorphism
				// Поскольку он ссылается,а метод подкласса переопределяет метод родительского класса, 
				//метод подкласса вызывается во время выполнения.
    }

}
//Тип объекта не может быть определен компилятором, поскольку экземпляр Dog также является экземпляром Animal
//Таким образом, компилятор не знает его тип, только его базовый тип.
