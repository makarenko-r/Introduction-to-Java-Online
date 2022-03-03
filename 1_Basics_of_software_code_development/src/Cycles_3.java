import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cycles_3 {

    public static void main(String[] args) {
        double x, h, output;
        System.out.println("Циклы. Задача №3.");
        System.out.println("По умолчанию для определения суммы квадратов чисел от 1 до 100, введите последовательно начальное число - 1 и шаг изменения 1.");
        // Ввод значения стартового числа
        while (true) {
            try {
                System.out.print("Введите значение начального числа: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения шага изменения
        while (true) {
            try {
                System.out.print("Введите значение шага изменения чисел, h = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                h = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вычисление значения суммы квадратов первых ста чисел начиная с x с шагом изменения h
        output = 0;                      // инициализация суммы
        for (int i = 0; i<100; i++) {
            output+=(x * x);
            x = x + h;
        }
        // Вывод результата расчета на экран
        System.out.println("Сумма квадрата первых 100 чисел равна " + output + ".");
    }
}