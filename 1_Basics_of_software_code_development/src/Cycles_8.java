import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cycles_8 {

    public static void main(String[] args) {
        String x, y; double check_double;
        System.out.println("Циклы. Задача №8.");
        // Ввод значения первого числа x
        while (true) {
            try {
                System.out.print("Введите первое число, x = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = input;
                check_double = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неподобающее значение. Повторите ввод.");
            }
        }
        // Ввод значения второго числа y
        while (true) {
            try {
                System.out.print("Введите второе число, y = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y = input;
                check_double = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неподобающее значение. Повторите ввод.");
            }
        }
        // Определение цифр, входящих в запись как первого так и второго числа
        for (char ch = '0';ch <= '9'; ch++) {
            if ( (x.indexOf(ch)>=0) && (y.indexOf(ch)>=0)) System.out.println("Цифра " + ch + " входит в состав обоих чисел.");
            else if ( (x.indexOf(ch)>=0) && (y.indexOf(ch)==-1)) System.out.println("Цифра " + ch + " входит в состав только первого числа.");
            else if ( (x.indexOf(ch)==-1) && (y.indexOf(ch)>=0)) System.out.println("Цифра " + ch + " входит в состав только второго числа.");
            else System.out.println("Цифра " + ch + " не входит в состав обоих чисел");
        }
    }
}
