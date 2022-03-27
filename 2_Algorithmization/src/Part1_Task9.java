import java.util.Arrays;

public class Part1_Task9 {
    public static void main(String[] args) {
        int n;                  // количество элементов массива
        int[] array;            // исходный массив
        int[] arrayHelp;        // дополнительный массив для подсчёта количества повторений каждого элемента в массиве
        int max;                // максимальное число повторений элемента
        int indexMax;           // индекс наиболее повторяющегося числа в массиве

        System.out.println("Одномерные массивы. Задача №9");

        // Определим количество элементов массива случайным образом от 1 до 20
        n = (int) (Math.random()*20+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями в интервале [0;10]
        array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = (int) (Math.random()*11);
        }
        // Выведем массив для наглядности
        System.out.println("Создан массив целых чисел в интервале [0;10] с числом элементов - " + n + ".");
        System.out.println(Arrays.toString(array));
        // Создадим дополнительный массив для подсчёта повторений
        arrayHelp = new int[n];
        // Подсчёт количества повторений каждого элемента в массиве
        // с изменением повторных элементов исходного массива на -1
        for (int i=0; i<n; i++) {
            arrayHelp[i]++;
            if (array[i] == -1) continue;
            //System.out.print("i = " + i );    //for test
            //System.out.print(", j = ");       //for test
            for (int j=i+1; j<n; j++) {
                //System.out.print(j + " ");    //for test
                if (array[j] == -1) continue;
                if (array[i] == array[j]) {
                    array[j] = -1;
                    arrayHelp[i]++;
                }
            }
            //System.out.println();             //for test
        }
        //System.out.println(Arrays.toString(array));       //for test
        //System.out.println(Arrays.toString(arrayHelp));   //for test
        // Поиск наиболее повторяющегося числа в массиве, с учетом вероятности, что таких чисел может быть несколько
        max = arrayHelp[0];
        indexMax = 0;
        for (int i=1; i<n; i++) {
            if (max < arrayHelp[i]) {
                max = arrayHelp[i];
                indexMax = i;
            }
            else if (max == arrayHelp[i] && array[i] < array[indexMax]) {
                max = arrayHelp[i];
                indexMax = i;
            }
        }
        // Вывод заданного по условию числа
        if (arrayHelp[indexMax]>1) System.out.println("Наиболее повторяющееся число в массиве - " + array[indexMax] + ", число повторений - " + arrayHelp[indexMax] + ".");
        else System.out.println("Повторяющихся чисел в массиве нет.");
    }
}