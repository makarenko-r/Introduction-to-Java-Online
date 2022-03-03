import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cycles_4 {

    public static void main(String[] args) {
        double x, h, output;    int E=0;
        System.out.println("Циклы. Задача №4.");
        System.out.println("По умолчанию для определения произведения чисел от 1 до 200, введите последовательно начальное число - 1 и шаг изменения 1.");
        // Ввод значения стартового числа
        while (true) {
            try {
                System.out.print("Введите значение начального числа: ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                x = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Ввод значения шага изменения
        while (true) {
            try {
                System.out.print("Введите значение шага изменения чисел, h = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                h = Double.parseDouble(input);
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вычисление значения произведения квадратов первых 200 чисел начиная с x с шагом изменения h
        output = 1;                      // инициализация суммы
        for (int i = 0; i<200; i++) {
            output*=((x + h * i) * (x + h * i)); System.out.println((x + h * i)+" "+output);
        }
        // в случае если результат output превысит возможности типа double с граничным значением 1,7*10^308
        // и выдаст Infinity - то в if цикл повторится и получится приблизительное значение
        // произведения квадратов с точным значением количества разрядов
        if (output==Double.POSITIVE_INFINITY) {
            output = 1;
            for (int i=0; i<200; i++) {
                output*=((x + h * i) * (x + h * i)); System.out.println((x + h * i)+" "+output);
                while (output>10) {     // отбираем разряды, чтобы double не переполнился и не стал Infinity
                    output/=10;
                    E++;
                }
            }
            System.out.println("Произведение квадратов первых 200 чисел приблизительно равно " + output + " в степени E" + E + ".");
        }
        else System.out.println("Произведение квадратов первых 200 чисел равно " + output + ".");
    }
}