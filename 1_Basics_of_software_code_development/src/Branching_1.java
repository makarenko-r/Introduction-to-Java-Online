import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Branching_1 {

    public static void main(String[] args) {
        double angle_1, angle_2, angle_3; String output = "Нет, не существует.";
        System.out.println("Ветвление. Задача №1.");
        // Ввод значения angle_1
        while (true) {
            try {
                System.out.print("Введите значение первого угла треугольника: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                angle_1 = Double.parseDouble(input);
                if (angle_1 <= 0 || angle_1 >= 180) throw new Exception();
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения angle_2
        while (true) {
            try {
                System.out.print("Введите значение второго угла треугольника: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                angle_2 = Double.parseDouble(input);
                if (angle_2 <= 0 || angle_2 >= 180) throw new Exception();
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вычисление значения третьего угла
        angle_3 = 180 - angle_1 - angle_2;
        // Расчет: существует треугольник или нет

        if (angle_3 > 0 && angle_3 < 180) {
            output = "Да, существует.";
            if (angle_1 == 90 || angle_2 == 90 || angle_3 == 90) {
                output+=" Это прямоугольный треугольник.";
                if (angle_1 == angle_2 || angle_1 == angle_3 || angle_2 == angle_3) output+=" Также этот треугольник является равнобедренным.";
            }
            else if (angle_1 > 90 || angle_2 > 90 || angle_3 > 90) {
                output+=" Это тупоугольный треугольник с тупым углом " + Math.max(Math.max(angle_1,angle_2),angle_3) + " градусов.";
                if (angle_1 == angle_2 || angle_1 == angle_3 || angle_2 == angle_3) output+=" Также этот треугольник является равнобедренным.";
            }
            else if (angle_1 == angle_2 && angle_1 == angle_3) output+=" Это равносторонний треугольник.";
            else if (angle_1 == angle_2 || angle_1 == angle_3 || angle_2 == angle_3) output+=" Это равнобедренный треугольник.";
            else output+=" Это остроугольный треугольник.";
        }
        // Вывод результата
        // Изначально output = "Нет, не существует."
        System.out.println("Существует ли треугольник? " + output);
    }
}
