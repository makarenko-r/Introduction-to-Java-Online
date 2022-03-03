import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cycles_1 {

    public static void main(String[] args) {
        int x; long output;
        System.out.println("Циклы. Задача №1.");
        // Ввод значения x
        while (true) {
            try {
                System.out.print("Введите любое целое положительное число, x = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = Integer.parseInt(input);
                if (x>0) break;                 // Проверка на 0 и отрицательные
                else throw new Exception();     // Выброс исключения если 0 или -
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вычисление значения суммы от 0 до x
        output = 0L;
        for (int i=1; i<=x; i++) {
            output+=i;
            System.out.println(output);
        }
        // Вывод результата
        System.out.println("Сумма от 1 до " + x + " равна " + output + ".");
    }
}