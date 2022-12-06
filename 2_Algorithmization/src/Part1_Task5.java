import java.util.Arrays;

public class Part1_Task5 {
    public static void main(String[] args) {
        int arrayCounter;           // количество элементов массива
        int[] array;                // исходный массив

        System.out.println("Одномерные массивы. Задача №5");

        // Определим количество элементов массива случайным образом от 1 до 10
        arrayCounter = (int) (Math.random()*10+1);       // +1 т.к. n не может быть равным нулю

        // Создадим и заполним массив значениями в интервале [-10;10]
        array = new int[arrayCounter];
        for (int i=0; i<arrayCounter; i++) {
            array[i] = (int) (Math.random()*11);
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }

        // Выведем массив для наглядности
        System.out.println("Создан массив целых чисел с " + arrayCounter + " элементами в интервале [-10;10].");
        System.out.println(Arrays.toString(array));

        // Выводим на печать a[i] при условии a[i]>i
        System.out.println("Элементы массива, удовлетворяющие условию a[i]>i.");
        for (int i=0; i<arrayCounter; i++) {
            if (array[i]>i) System.out.print(array[i]+" ");
        }
    }
}