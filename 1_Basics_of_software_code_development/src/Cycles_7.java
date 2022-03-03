import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cycles_7 {

    public static void main(String[] args) {
        int m, n;
        System.out.println("Циклы. Задача №7.");
        // Ввод значения m
        while (true) {
            try {
                System.out.print("Введите натуральное число m = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                m = Integer.parseInt(input);
                if (m <= 0) throw new Exception();      // натуральное число больше 0
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения n
        while (true) {
            try {
                System.out.print("Введите натуральное число, n = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                n = Integer.parseInt(input);
                if (n <= m) throw new Exception(); // [m,n] - n - по определению не может быть меньше либо равно m
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вывод делителей числа кроме единицы и самого числа
        for (int i = m; i <= n; i++) {
            System.out.print("Делители для числа " + i + ": ");

            for (int j = 2; j < i; j++) {
                if (i % j == 0) System.out.print(j + " ");
            }
            System.out.println();
        }
    }
}