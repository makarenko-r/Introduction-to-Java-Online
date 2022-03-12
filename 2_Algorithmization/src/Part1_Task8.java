import java.util.Arrays;

public class Part1_Task8 {
    public static void main(String[] args) {
        int n;                  // количество элементов массива
        int min;
        int[] array;            // исходный массив
        int[] arrayNew;         // массив для новой последовательности

        System.out.println("Одномерные массивы. Задача №8");

        // Определим количество элементов массива случайным образом от 1 до 10
        n = (int) (Math.random()*10+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями в интервале [-10;10]
        array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = (int) (Math.random()*11);
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Выведем массив для наглядности
        System.out.println("Создан массив целых чисел в интервале [-10;10] с числом элементов от 1 до 10.");
        System.out.println(Arrays.toString(array));
        // Поиск минимума
        min = array[0];
        for (int i = 1; i < array.length; i++) {
            if (min > array[i]) min = array[i];
        }
        System.out.println("Минимум равен: " + min + ".");
        // Подсчет количества повторений минимума в исходной последовательности
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (min == array[i]) count++;
        }
        // Создание новой последовательности с исключением членов изначальной последовательности, равных min
        arrayNew = new int[array.length-count];
        count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] != min) {
                arrayNew[count] = array[i];
                count++;
            }
        }
        // Выведем новую последовательность
        System.out.println("Новая последовательность: " + Arrays.toString(arrayNew) + ".");
    }
}