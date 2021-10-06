import java.util.Arrays;

public class Part1_Task5 {
    public static void main(String[] args) {
        int n;                  // количество элементов массива
        int[] array;            // исходный массив

        System.out.println("Одномерные массивы. Задача №5");

        // Определим количество элементов массива случайным образом от 1 до 10
        n = (int) (Math.random()*10+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями от 0 до 10
        array = new int[n];
        for (int i=0; i<n; i++) {
            array[i] = (int) (Math.random()*11);
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Выведем массив для наглядности
        System.out.println("Массив создан");
        System.out.println(Arrays.toString(array));
        // Выводим на печать a[i] при условии a[i]>i
        System.out.println("Элементы массива, удовлетворяющие условию a[i]>i");
        for (int i=0; i<n; i++) {
            if (array[i]>i) System.out.print(array[i]+" ");
        }
    }
}
