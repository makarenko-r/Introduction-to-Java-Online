import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Linear_2 {

    public static void main(String[] args) {
        double a, b, c, output;
        System.out.println("Линейные программы. Задача №2.");
        // Ввод значения a
        while (true) {
            try {
                System.out.print("Введите значение, a = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                a = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
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
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
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
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Вычисление значения выражения
        output = (b+Math.sqrt(Math.pow(b,2)+4*a*c))/(2*a)-Math.pow(a,3)*c+Math.pow(b,-2);
        // Вывод результата
        System.out.println("Значение выражения равно " + output + ".");
    }
}
