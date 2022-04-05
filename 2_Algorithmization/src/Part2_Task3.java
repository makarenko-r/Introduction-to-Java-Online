import java.util.Arrays;

public class Part2_Task3 {
    public static void main(String[] args) {
        int n;                  // количество строк массива
        int m;                  // количество столбцов массива
        int[][] array;          // исходный массив
        int k;                  // k-строка
        int p;                  // p-столбец

        System.out.println("Массивы массивов. Задача №3");

        // Определим количество строк массива случайным образом от 3 до 10
        n = (int) (Math.random()*8+3);
        // Определим количество столбцов массива случайным образом от 3 до 10
        m = (int) (Math.random()*8+3);

        // Создадим и заполним массив значениями в интервале [-10;10]
        array = new int[n][m];
        for (int i=0; i<n; i++) {
            for (int j=0; j<m; j++) {
                array[i][j] = (int) (Math.random()*11);
                if (Math.random()<0.5) array[i][j]*=(-1);      // добавим случайным образом в массив отрицательные элементы
            }
        }
        // Выведем массив для наглядности
        System.out.println("Создан двумерный массив " + n + "x" + m + " целых чисел в интервале [-10;10].");
        for (int i=0; i<array.length; i++) {
            System.out.println(Arrays.toString(array[i]));
        }
        // Определяем случайным образом k-строку и p-столбец
        k = (int) (Math.random()*n);
        p = (int) (Math.random()*m);
        System.out.println("Случайным образом определим k-ю строку и p-ый столбец: k = " + (k+1) + ", p = " + (p+1) + ".");
        // Вывод k-й строки
        System.out.println((k+1) + "-я строка:");
        for (int i=0; i<m; i++) {
            System.out.print(array[k][i]+"\t\t");
        }
        System.out.println();
        // Вывод p-го столбца
        System.out.println((p+1) + "-й столбец:");
        for (int i=0; i<n; i++) {
            System.out.println(array[i][p]);
        }
    }
}