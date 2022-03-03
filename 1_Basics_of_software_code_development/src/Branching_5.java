import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Branching_5 {

    public static void main(String[] args) {
        double x, output;
        System.out.println("Ветвление. Задача №5.");
        // Ввод значения x
        while (true) {
            try {
                System.out.print("Введите значение, x = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вычисление значения функции
        if (x <= 3) output = x*x - 3*x + 9;
        else output = 1 / (x*x*x + 6);
        System.out.println("Значение функции равно:\nF(x) =  " + output);
    }
}
