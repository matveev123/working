import java.util. * ;
import static java.lang.System.*;
public class Untitled {
    String input = "0123";

    public void print(String str)throws IllegalArgumentException{
        int output = 0;
        try {
            String input = str;
            output = Integer.parseInt(input);
        } catch (Exception e) {
            System.out.println("000");
        }
        //System.out.println("input " + input + " , output " + output);
		out.println("Miracle!");
		

    }
    //private String str = "2022";

    public static void main(String[]args) {
        //System.out.println(new Untitled(). );
        //System.out.println(new Untitled().list.add(new Untitled().str));
        Untitled u = new Untitled();
        u.print("2013");
        //Строка - объект, что представляет последовательность символов. Для манипуляций и создания строками предсатвлен финальный(не может иметь подкалссов)
        //Класс java.lang.String - immutable.Созданый им объект не может быть изменён, методы просто создают и возвращают строки в которых результат операции
        // Неизменяемость строк позволяе

    }
    //java.util.List<String> list = new ArrayList<String>();
}
