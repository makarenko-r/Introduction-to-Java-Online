import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Linear_1 {

    public static void main(String[] args) {
        double a, b, c, z;
        System.out.println("Линейные программы. Задача №1.");
        // Ввод значения a
        while (true) {
            try {
                System.out.print("Введите значение, a = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                a = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения b
        while (true) {
            try {
                System.out.print("Введите значение, b = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                b = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения c
        while (true) {
            try {
                System.out.print("Введите значение, c = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                c = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вычисление значения z
        z = ((a-3)*b/2)+c;
        // Вывод результата
        System.out.println("Значение функции z равно " + z + ".");
    }
}
