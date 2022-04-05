import java.util.Arrays;

public class Part2_Task2 {
    public static void main(String[] args) {
        int n;                  // количество строк и столбцов массива
        int[][] array;          // исходный массив

        System.out.println("Массивы массивов. Задача №2");

        // Определим порядок массива случайным образом от 3 до 10
        n = (int) (Math.random()*8+3);

        // Создадим и заполним массив значениями в интервале [-10;10]
        array = new int[n][n];
        for (int i=0; i<n; i++) {
            for (int j=0; j<n; j++) {
                array[i][j] = (int) (Math.random()*11);
                if (Math.random()<0.5) array[i][j]*=(-1);      // добавим случайным образом в массив отрицательные элементы
            }
        }
        // Выведем массив для наглядности
        System.out.println("Создан двумерный массив " + n + "x" + n + " целых чисел в интервале [-10;10].");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        // Выводим на печать столбцы, удовлетворяющие условию
        System.out.println("Элементы массива, стоящие на главной диагонали:");
        for (int i=0; i<array.length; i++) {
            System.out.print(array[i][i]+"\t\t");
        }
    }
}