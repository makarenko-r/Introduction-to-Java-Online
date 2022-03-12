import java.util.Arrays;

public class Part1_Task7 {
    public static void main(String[] args) {
        int n;                  // количество элементов массива
        double[] array;         // исходный массив
        double[] arrayHelp;     // дополнительный массив
        double max;

        System.out.println("Одномерные массивы. Задача №7");

        // Определим количество элементов массива случайным образом от 10 до 20
        n = (int) (Math.random()*11+10);
        System.out.println(n);
        if (n % 2 != 0) n++;    // на случай если n будет нечётным
        System.out.println(n);
        // Создадим и заполним массив значениями в интервале (-10;10)
        array = new double[n];
        for (int i=0; i<n; i++) {
            array[i] = Math.random()*10;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Выведем массив для наглядности
        System.out.println("Создан массив действительных чисел в интервале (-10;10) с числом элементов от 10 до 20.");
        System.out.println(Arrays.toString(array));
        // Инициализируем и заполним дополнительный массив для формирования в нем сумм значений a(1)+a(2n), a(2)+a(2n-1) и т.д.
        arrayHelp = new double[n/2];
        for (int i = 0, j = (array.length-1); i < arrayHelp.length; i++, j--) {
            arrayHelp[i] = array[i] + array[j];
        }
        System.out.println("Создан дополнительный массив со значениями a(1)+a(2n), a(2)+a(2n-1) и т.д.");
        System.out.println(Arrays.toString(arrayHelp));
        // Поиск максимума в дополнительном массиве согласно условия

        // variant №1
        max = arrayHelp[0];
        for (int i = 1; i < arrayHelp.length; i++) {
            if (max < arrayHelp[i]) max = arrayHelp[i];
        }
        System.out.println("Масимум равен: " + max + ".");

        // variant №2
        Arrays.sort(arrayHelp);
        System.out.println("Масимум равен: " + arrayHelp[arrayHelp.length-1] + ".");

        // variant №3
        max = array[0] + array[array.length-1];
        for (int i = 1; i < array.length/2; i++) {
            if (max < (array[i]+array[array.length-i-1])) max = (array[i]+array[array.length-i-1]);
        }
        System.out.println("Масимум равен: " + max + ".");
    }
}