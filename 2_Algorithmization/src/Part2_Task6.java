import java.util.Arrays;

public class Part2_Task6 {
    public static void main(String[] args) {
        int n;                  // количество строк и столбцов массива
        int[][] array;          // исходный массив

        System.out.println("Массивы массивов. Задача №6");

        // Определим порядок массива случайным образом от 6 до 10
        n = (int) (Math.random()*3+3)*2;

        // Создадим базовый массив, заполненный нулями
        array = new int[n][n];
        // Выведем массив для наглядности
        System.out.println("Создан двумерный массив " + n + "x" + n + ", заполненный нулями.");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        // Изменяем базовый массив по заданному образцу
        for (int i=0; i<=array.length/2; i++) {
            for (int j=i; j<=array.length/2; j++) {
                array[i][j] = 1;
                array[i][array.length-1-j] = 1;
                array[array.length-1-i][j] = 1;
                array[array.length-1-i][array.length-1-j] = 1;
            }
        }
        System.out.println("Изменённый массив, согласно заданному образцу:");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
    }
}