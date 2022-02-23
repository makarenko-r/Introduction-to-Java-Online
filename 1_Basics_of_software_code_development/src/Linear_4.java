import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Linear_4 {

    public static void main(String[] args) {
        double R, output;
        System.out.println("Линейные программы. Задача №4.");
        // Ввод значения R
        while (true) {
            try {
                System.out.print("Введите значение вида nnn.ddd, R = ");
                BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
                String input = reader.readLine();
                R = Double.parseDouble(input);                  // Проверка на число
                // Проверка на ввод значения соответствующего вида
                char[] inputToArray = input.toCharArray();      // Преобразование строки в массив char
                if (inputToArray.length == 7 && R < 1000 && R > -1000) break;                                   // +
                else if (inputToArray.length == 8 && inputToArray[0] == '-' && R < 1000 && R > -1000) break;    // -
                else throw new Exception();                     // Выброс исключения на случай несоответствия виду
            } catch (Exception ex) {
                System.out.println("Вы ввели некорректное значение. Повторите ввод.");
            }
        }
        // Вычисление значения выражения
        output = (int) (R%1*1000) + ((int) (R/1))/1000.;
        // Вывод результата
        System.out.println("Значение выражения равно " + output + ".");
    }
}
