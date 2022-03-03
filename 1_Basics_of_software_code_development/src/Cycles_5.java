import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Cycles_5 {

    public static void main(String[] args) {
        double e, a_n, output; int n;
        System.out.println("Циклы. Задача №5.");
        // Ввод значения e
        while (true) {
            try {
                System.out.print("Ввод значения e:\nЗначение e должно быть больше нуля\ne = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                e = Double.parseDouble(input);
                if (e<=0) throw new Exception();
                break;
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }

        // Вычисление значения суммы тех членов ряда, модуль которых больше или равен заданному e
        output = 0; // инициализация суммы
        n = 1;
        a_n = 1/(Math.pow(2,n))+1/(Math.pow(3,n));
        while (e<a_n) {
            output+=a_n;
            n++;
            System.out.println("Следующий член ряда, удовлетворящий условиям - "+a_n+", сумма членов ряда равна: "+output+"."); // Вывод результата
            a_n = 1/(Math.pow(2,n))+1/(Math.pow(3,n));
        }
    }
}