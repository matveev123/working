public class DataMemberPoly {
    public static class bike {
        int speedlimit = 90;
    }
    public static class honda3 extends bike {
        int speedlimit = 130;
    }
    public static void main(String[]args) {
        bike obj = new honda3();
        System.out.println(obj.speedlimit); //90
        //Мы обращаемся к элементу данных с помощью ссылочной переменной родительского класса, которая ссылается на объект подкласса.
        //Поскольку мы обращаемся к элементу данных, который не переопределен, следовательно, он всегда будет обращаться к элементу данных родительского класса.

    }
    //Тип объекта не может быть определен компилятором, поскольку экземпляр Dog также является экземпляром Animal
    //Таким образом, компилятор не знает его тип, только его базовый тип.
}
