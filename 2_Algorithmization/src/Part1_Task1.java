import java.sql.Array;

public class Part1_Task1 {
    public static void main(String[] args) {
        int n;          // количество элементов массива
        int[] array;    // исходный массив
        int k;
        int sum;

        System.out.println("Одномерные массивы. Задача №1");

        // Определим количество элементов массива случайным образом от 1 до 1000
        n = (int) (Math.random()*1000+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями от 1 до 100000
        array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = (int) (Math.random()*100000+1);
        }
        // Определим случайным образом заданное k в промежутке от 1 до 1000
        k = (int) (Math.random()*1000+1);
        // Инициализируем сумму
        sum = 0;
        // Произведем подсчет суммы элементов массива, кратных k
        for (int j: array) {
            if ((j % k) == 0) sum+=j;
        }
        // Вывод результата
        System.out.println("Сумма элементов массива состоящего из " + array.length +
                " элементов массива, кратных " + k + " равна: " + sum + "." );
    }
}
