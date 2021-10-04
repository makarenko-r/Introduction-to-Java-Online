import java.util.Arrays;

public class Part1_Task4 {
    public static void main(String[] args) {
        int n;                  // количество элементов массива
        double[] array;         // исходный массив
        double max; int maxCounter; int maxIndex;
        double min; int minCounter; int minIndex;

        System.out.println("Одномерные массивы. Задача №4");

        // Определим количество элементов массива случайным образом от 2 до 10
        n = (int) (Math.random()*9+2);       // +2 т.к. n не может быть равным нулю и 1 т.к. нужно поменять местами
        // Создадим и заполним массив значениями в интервале [-10;10]
        array = new double[n];
        for (int i=0; i<n; i++) {
            array[i] = Math.random()*11;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Выведем массив для наглядности
        System.out.println("Массив создан");
        System.out.println(Arrays.toString(array));
        // Инициализируем переменные, хранящие max и min значения массива + счетчики повторений + номер позиции
        max = array[0];     maxCounter = 0;     maxIndex = 0;
        min = array[0];     minCounter = 0;     minIndex = 0;
        // Определим максимальное и минимальное значения массива, номер позиции
        for (int i = 1; i<n; i++) {
            if (array[i]>max) {
                maxIndex = i;
                max = array[i];
            }
            if (array[i]<min) {
                minIndex = i;
                min = array[i];
            }
        }
        // Определим количество повторений
        for (int i = 0; i<n; i++) {
            if (array[i]>=max) maxCounter++;
            if (array[i]<=min) minCounter++;
        }
        System.out.println("Выполним проверку:");
        System.out.println("max=" + max + " maxIndex="+maxIndex + " maxCounter=" + maxCounter); // for check
        System.out.println("min=" + min+" minIndex=" + minIndex + " minCounter" + minCounter);  // for check
        // Поменяем местами наибольший и наименьший элементы
        if ((maxCounter==1)&&(minCounter==1)) {
            array[minIndex] = max;
            array[maxIndex] = min;
        }
        else {
            for (int i=0; i<n; i++) {
                if (array[i]==max) array[i]=min;
                if (array[i]==min) array[i]=max;
            }
        }
        // Вывод массива после перемены мест
        System.out.println("Измененный массив");
        System.out.println(Arrays.toString(array));
    }
}
