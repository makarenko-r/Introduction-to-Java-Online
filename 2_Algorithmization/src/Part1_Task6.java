import java.sql.Array;
import java.util.Arrays;

public class Part1_Task6 {
    public static void main(String[] args) {
        int n;              // количество элементов массива
        double[] array;     // исходный массив
        double sum;

        System.out.println("Одномерные массивы. Задача №6");

        // Определим количество элементов массива случайным образом от 1 до 10
        n = (int) (Math.random()*10+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями от 0 до 10
        array = new double[n];
        for (int i=0; i<n; i++) {
            array[i] = Math.random()*10+1;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Выведем массив для наглядности
        System.out.println("Массив создан");
        System.out.println(Arrays.toString(array));
        // Вычисляем сумму чисел, порядковые номера которых являются простыми числами
        sum = 0;
        for (int i=1; i<n; i++) {
            int counter = 0;
            for (int j=1; j<=i; j++) {
                if (i%j==0) counter++;
            }
            if (counter==1 || counter==2) sum+=array[i];
        }
        // Выводим на печать сумму чисел, порядковые номера которых являются простыми числами
        System.out.println("Сумма чисел, порядковые номера (от 0 до N-1) которых являются простыми числами: " + sum + ".");
    }
}
