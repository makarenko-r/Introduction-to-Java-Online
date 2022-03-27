import java.util.Arrays;

public class Part1_Task10 {
    public static void main(String[] args) {
        int n;                  // количество элементов массива
        int[] array;            // исходный массив

        System.out.println("Одномерные массивы. Задача №10");

        // Определим количество элементов массива случайным образом от 1 до 10
        n = (int) (Math.random()*10+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями в интервале [-10;10]
        array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = (int) (Math.random()*11);
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Выведем массив для наглядности
        System.out.println("Создан массив целых чисел в интервале [-10;10] с числом элементов - " + n + ".");
        System.out.println(Arrays.toString(array));
        // Сжимаем массив, выбросив из него каждый второй элемент, заменив освободившиеся элементы нулями
        for (int i=1; i<n; i++, i++) {
            array[i] = 0;
        }
        // Выводим на печать изменённый массив
        System.out.println("Массив изменён.");
        System.out.println(Arrays.toString(array));
    }
}