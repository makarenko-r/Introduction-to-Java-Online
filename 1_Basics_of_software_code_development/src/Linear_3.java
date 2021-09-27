import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Linear_3 {

    public static void main(String[] args) {
        double x, y, output;
        System.out.println("Линейные программы. Задача №3.");
        // Ввод значения x
        while (true) {
            try {
                System.out.print("Введите значение, x = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения y
        while (true) {
            try {
                System.out.print("Введите значение, y = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Вычисление значения выражения
        output = ((Math.sin(x)+Math.cos(y))/(Math.cos(x)-Math.sin(y))*Math.tan(x*y));
        // Вывод результата
        System.out.println("Значение выражения равно " + output + ".");
    }
}
