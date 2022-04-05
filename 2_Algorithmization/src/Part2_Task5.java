import java.util.Arrays;

public class Part2_Task5 {
    public static void main(String[] args) {
        int n;                  // количество строк и столбцов массива
        int[][] array;          // исходный массив

        System.out.println("Массивы массивов. Задача №5");

        // Определим порядок массива случайным образом от 3 до 10
        n = (int) (Math.random()*8+3);

        // Создадим базовый массив, заполненный нулями
        array = new int[n][n];
        // Выведем массив для наглядности
        System.out.println("Создан двумерный массив " + n + "x" + n + ", заполненный нулями.");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        // Изменяем базовый массив по заданному образцу
        for (int i=0; i<array.length; i++) {
            for (int j=0; j<n-i; j++) {
                array[i][j] = i+1;
            }
        }
        System.out.println("Изменённый массив, согласно заданному образцу:");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}