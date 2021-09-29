import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Cycles_2 {

    public static void main(String[] args) {
        double A, B, h, x, y;
        int n, numbers_before_dot, numbers_after_dot, round_precision;
        System.out.println("Циклы. Задача №2.");
        // Ввод значения A
        while (true) {
            try {
                System.out.print("Введите значение нижней границы интервала [A,B], A = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                // данные действия необходимы для определения максимальной точности которую мы сможем задать
                // основываясь на введенных данных, чтобы отсечь лишний хвост от double
                // в качестве точности - имеется ввиду количество цифр после запятой при вычислениях и выводе,
                // определяемое переменной round_precision
                numbers_before_dot = input.indexOf('.');                // определение количества цифр до запятой
                numbers_after_dot = input.length() - numbers_before_dot;// определение количества цифр после запятой
                round_precision = numbers_after_dot;                    // определение минимальной точности округления
                A = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения B
        while (true) {
            try {
                System.out.print("Введите значение верхней границы интервала [A,B], B = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                B = Double.parseDouble(input);
                if (B>A) {
                    // определение точности которую мы сможем задать
                    // основываясь на введенных данных, чтобы отсечь лишний хвост от double
                    numbers_before_dot = input.indexOf('.');                // определение количества цифр до запятой
                    numbers_after_dot = input.length() - numbers_before_dot;// определение количества цифр после запятой
                    if (round_precision<numbers_after_dot) round_precision = numbers_after_dot; // переопределение точности
                    break;                      // Проверка на логику B>A
                }
                else throw new Exception();     // Выброс исключения если B<=A
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения h
        while (true) {
            try {
                System.out.print("Введите значение шага вычисления, h = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                h = Double.parseDouble(input);

                // определение точности которую мы сможем задать
                // основываясь на введенных данных, чтобы отсечь лишний хвост от double
                numbers_before_dot = input.indexOf('.');                // определение количества цифр до запятой
                numbers_after_dot = input.length() - numbers_before_dot;// определение количества цифр после запятой
                if (round_precision<numbers_after_dot) round_precision = numbers_after_dot; // переопределение точности
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Определение точности
        if (round_precision>15) round_precision = 15;
        // точность типа double составляет 15 знаков после запятой
        // и если round_precision больше 15 то мы принудительно уменьшим точность до 15 знаков

        // Вычисление значения функции на интервале [A,B] с шагом h
        double i = 0;
        x = round_double(A,round_precision);                    // начальное значение x
        while (x <= B) {
            if (x < 2) y = x;
            else y = -x;
            System.out.println("x = " + x + " , y = " + y);     // вывод результата на печать
            i++;                                                // Инкрементация "счетчика"
            x = round_double((A + i * h),round_precision);      // Изменение x на величину шага
        }
    }

    static double round_double (double input, int precision) {  // Отсекание хвоста double после запятой свыше
        double help = Math.pow (10, precision);                 // заданного параметра precision
        return Math.round(input * help) / help;
    }
}
