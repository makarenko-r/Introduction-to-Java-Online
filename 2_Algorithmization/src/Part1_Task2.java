import java.sql.Array;

public class Part1_Task2 {
    public static void main(String[] args) {
        int n;             // количество элементов массива
        double[] array;    // исходный массив
        int z;
        int counter;

        System.out.println("Одномерные массивы. Задача №2");

        // Определим количество элементов массива случайным образом от 1 до 1000
        n = (int) (Math.random()*1000+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями от 0 до 99999
        array = new double[n];
        for (int i=0; i<n; i++) {
            array[i] = Math.random()*100000;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Определим случайным образом заданное z в промежутке от 0 до 99999
        z = (int) (Math.random()*100000);
        // Инициализируем счетчик
        counter = 0;
        // Произведем замену элементов массива, которые больше z, и подсчитаем количество замен
        for (int i = 0; i<n; i++) {
            if (array[i] > z) {
                array[i] = z;
                counter++;
            }
        }
        // Вывод результата
        System.out.println("Количество элементов массива состоящего из " + array.length +
                " элементов, больших, чем " + z + ": " + counter + "." );
    }
}
