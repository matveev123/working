package vlad;
public class Solution {

    public static void showWeather(City city) {
        //напишите тут ваш код
        System.out.println("В городе" + city.getName() + " сегодня температура воздуха " + city.getTemperature());
    }

    public static void main(String[]args) {
        City city = new City("Дубай", 40);
        showWeather(city);
    }
}
