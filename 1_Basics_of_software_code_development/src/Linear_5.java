import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Linear_5 {

    public static void main(String[] args) {
        int T;
        String output;
        System.out.println("Линейные программы. Задача №5.");
        // Ввод значения T
        while (true) {
            try {
                System.out.print("Введите натуральное число, Т = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                T = Integer.parseInt(input);
                if (T < 0) throw new Exception();
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }

        // Вычисление значения выражения
        output = T/3600 + "ч " + T % 3600 / 60 + "мин " + T % 60 + "с";
        // Вывод результата
        System.out.println("Значение длительности времени равно " + output + ".");
    }
}
