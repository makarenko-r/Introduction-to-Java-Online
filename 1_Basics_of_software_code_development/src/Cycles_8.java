import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cycles_8 {

    public static void main(String[] args) {
        String x, y;
        System.out.println("Циклы. Задача №8.");
        // Ввод значения первого числа x
        while (true) {
            try {
                System.out.print("Введите первое число, x = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = input;
                double check_double = Double.parseDouble(input);   // для вызова ошибки в случае если введённое число не является double
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения второго числа y
        while (true) {
            try {
                System.out.print("Введите второе число, y = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y = input;
                double check_double = Double.parseDouble(input);   // для вызова ошибки в случае если введённое число не является double
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Определение цифр, входящих в запись как первого так и второго числа
        int check = 0;  // инициализация счетчика для особого вывода в случае если не будет совпадений чисел в обоих числах
        for (char ch = '0';ch <= '9'; ch++) {
            if ( (x.indexOf(ch)>=0) && (y.indexOf(ch)>=0)) {
                System.out.println("Цифра " + ch + " входит в состав обоих чисел.");    // Вывод информации о совпадении чисел
                check++;
            }
            // else if ( (x.indexOf(ch)>=0) && (y.indexOf(ch)==-1)) System.out.println("Цифра " + ch + " входит в состав только первого числа.");
            // else if ( (x.indexOf(ch)==-1) && (y.indexOf(ch)>=0)) System.out.println("Цифра " + ch + " входит в состав только второго числа.");
            // else System.out.println("Цифра " + ch + " не входит в состав обоих чисел");
        }
        if (check == 0) System.out.println("Нет совпадений чисел в введённых числах."); // Вывод информации в случае отсутствия совпадений чисел
    }
}