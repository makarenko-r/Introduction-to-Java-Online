import java.util.Arrays;

public class Part2_Task1 {
    public static void main(String[] args) {
        int n;                  // количество строк массива
        int m;                  // количество столбцов массива
        int[][] array;          // исходный массив
        int[] arrayHelp;        // вспомогательный массив

        System.out.println("Массивы массивов. Задача №1");

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
        // Определяем нечётные столбцы, у которых первый элемент больше последнего
        arrayHelp = new int[m];
        boolean check = false;      // Переменная для проверки есть ли столбцы, удовлетворяющие условию
        for (int i=0; i<arrayHelp.length; i++, i++) {
            if (array[0][i]>array[array.length-1][i]) {
                arrayHelp[i]=1;
                check = true;
            }
        }
        // Выводим на печать столбцы, удовлетворяющие условию
        if (check) {
            System.out.println("Все нечётные столбцы, у которых первый элемент больше последнего:");
            for (int i=0; i<array.length; i++) {
                for (int j=0; j<m; j++, j++) {
                    if (arrayHelp[j] == 1) System.out.print(array[i][j]+"\t\t");
                }
                System.out.println();
            }
        }
        else System.out.println("Нечётные столбцы, у которых первый элемент больше последнего, отсутствуют.");
    }
}