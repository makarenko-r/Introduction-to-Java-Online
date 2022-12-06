import java.util.Arrays;

public class Part1_Task6 {
    public static void main(String[] args) {
        int arrayCounter;           // количество элементов массива
        double[] array;             // исходный массив
        double sum = 0;

        System.out.println("Одномерные массивы. Задача №6");

        // Определим количество элементов массива случайным образом от 1 до 10
        arrayCounter = (int) (Math.random()*10+1);       // +1 т.к. n не может быть равным нулю

        // Создадим и заполним массив значениями в интервале (-10;10)
        array = new double[arrayCounter];
        for (int i=0; i<arrayCounter; i++) {
            array[i] = Math.random()*10;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }

        // Выведем массив для наглядности
        System.out.println("Создан массив вещественных чисел с " + arrayCounter + " элементами в интервале (-10;10).");
        System.out.println(Arrays.toString(array));

        // Вычисляем сумму чисел, порядковые номера которых являются простыми числами
        for (int i=1; i<=arrayCounter; i++) {
            int counter = 0;
            for (int j=1; j<=i; j++) {
                if (i%j==0) counter++;
            }
            if (counter==1 || counter==2) sum+=array[i-1];
        }

        // Выводим на печать сумму чисел, порядковые номера которых являются простыми числами
        System.out.println("Сумма чисел, порядковые номера (от 1 до N) которых являются простыми числами: " + sum + ".");
    }
}