import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Linear_6 {

    public static void main(String[] args) {
        double x, y; boolean output = false;
        System.out.println("Линейные программы. Задача №6.");
        // Ввод значения x
        while (true) {
            try {
                System.out.print("Введите координату, x = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения y
        while (true) {
            try {
                System.out.print("Введите координату, y = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // true или false - проверка на попадание в область
        // изначально output = false
        if (y <= 4 && y >= -3) {
            if (y > 0 && x <= 2 && x >= -2) output = true;
            if (y <= 0 && x <= 4 && x >= -4) output = true;
        }
        // Вывод результата
        System.out.println("Принадлежит ли точка закрашенной области - " + output + ".");
    }
}
