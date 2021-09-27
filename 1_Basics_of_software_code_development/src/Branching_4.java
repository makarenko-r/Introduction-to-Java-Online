import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Branching_4 {

    public static void main(String[] args) {
        double A, B, x, y, z; String output;
        System.out.println("Ветвление. Задача №4.");
        // Ввод значения A
        while (true) {
            try {
                System.out.print("Введите значение отверстия, A = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                A = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения B
        while (true) {
            try {
                System.out.print("Введите значение отверстия, B = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                B = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения x
        while (true) {
            try {
                System.out.print("Введите размер кирпича, x = ");
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
                System.out.print("Введите размер кирпича, y = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения z
        while (true) {
            try {
                System.out.print("Введите размер кирпича, z = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                z = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Пройдет ли кирпич через отверстие?
        if (A >= x && (B >= y || B >= z)) output = "Да, пройдет.";
        else if (A >= y && (B >= x || B >= z)) output = "Да, пройдет.";
        else if (A >= z && (B >= x || B >= y)) output = "Да, пройдет.";
        else output = "Нет, кирпич не пройдет через отверстие.";
        System.out.println("Пройдет ли кирпич через отверстие? " + output);
    }
}
