import java.util.Arrays;

public class Part2_Task7 {
    public static void main(String[] args) {
        int n;                  // количество строк и столбцов массива
        double[][] array;          // исходный массив
        int count = 0;          // счётчик положительных элементов

        System.out.println("Массивы массивов. Задача №7");

        // Определим порядок массива случайным образом от 3 до 10
        n = (int) (Math.random()*8+3);

        // Создадим базовый массив, заполненный нулями
        array = new double[n][n];
        // Выведем массив для наглядности
        System.out.println("Создан двумерный массив " + n + "x" + n + ", заполненный нулями.");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        // Изменяем базовый массив по заданному образцу
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<array.length; j++) {
                array[i][j] = Math.sin((i*i-j*j)/array.length);
                if (array[i][j]>0) count++;
            }
        }
        System.out.println("Изменённый массив, согласно заданному образцу:");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        if (count>0) System.out.println("Количество положительных элементов: " + count + ".");
        else System.out.println("Положительных элементов нет.");
    }
}