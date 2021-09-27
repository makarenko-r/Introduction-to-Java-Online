import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Branching_2 {

    public static void main(String[] args) {
        double a, b, c, d, output;
        System.out.println("Ветвление. Задача №2.");
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
        // Ввод значения d
        while (true) {
            try {
                System.out.print("Введите значение, d = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                d = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Вычисление значения max{min(a,b), min(c,d)}
        // output = Math.max(Math.min(a,b), Math.min(c,d));     // Через Math
        output = max(min(a,b),min(c,d));
        System.out.println("Значение max{min(a,b), min(c,d)} равно " + output + ".");
    }
    public static double max (double a, double b) {
        if (a > b) return a;
        else return b;
    }
    public static double min (double a, double b) {
        if (a < b) return a;
        else return b;
    }

}
