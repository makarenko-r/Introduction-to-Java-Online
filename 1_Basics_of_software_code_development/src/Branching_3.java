import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Branching_3 {

    public static void main(String[] args) {
        double x1, y1, x2, y2, x3, y3; String output = "Нет, не лежат.";
        System.out.println("Ветвление. Задача №3.");
        // Ввод значения x1
        while (true) {
            try {
                System.out.print("Введите значение, x1 = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x1 = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения y1
        while (true) {
            try {
                System.out.print("Введите значение, y1 = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y1 = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения x2
        while (true) {
            try {
                System.out.print("Введите значение, x2 = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x2 = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения y2
        while (true) {
            try {
                System.out.print("Введите значение, y2 = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y2 = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения x3
        while (true) {
            try {
                System.out.print("Введите значение, x3 = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x3 = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Ввод значения y3
        while (true) {
            try {
                System.out.print("Введите значение, y3 = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                y3 = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели неверное значение. Повторите ввод.");
            }
        }
        // Определяем лежат ли три точки на одной прямой
        // Любые две точки могут образовать прямую
        // Уравнение прямой y=kx+b              // y1=kx1+b -> y2=kx2+b -> y1-y2=kx1+b-kx2-b ->
        double k = (y1-y2)/(x1-x2);             // -> y1-y2=k(x1-x2) -> k=(y1-y2)/(x1-x2)
        double b = y1-k*x1;                     // y1=kx1+b -> b=y1-kx1
        if (y3 == (k*x3+b)) output = "Да, все три точки лежат на одной прямой. Уравнение прямой: y=" + k + "x+" + b + ".";
        System.out.println("Лежат ли три точки на одной прямой? " + output);
    }
}
