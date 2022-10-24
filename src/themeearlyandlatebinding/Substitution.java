public class Substitution {

    public static class animal {}

    public static class dog extends animal {}

    public static void main(String[]args) {
        dog obj = new dog(); //Объект - это экземпляр определенного класса java, но он также является экземпляром его суперкласса.
        // Здесь obj является экземпляром класса dog, но это также экземпляр animal.
    }
}
//Тип объекта не может быть определен компилятором, поскольку экземпляр Dog также является экземпляром Animal
//Таким образом, компилятор не знает его тип, (знает)только его базовый тип.
