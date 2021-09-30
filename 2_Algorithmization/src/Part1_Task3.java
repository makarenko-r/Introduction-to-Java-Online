import java.sql.Array;

public class Part1_Task3 {


    public static void main(String[] args) {
        int n;          // количество элементов массива
        double[] array;    // исходный массив
        int counterPositive;
        int counterNegative;
        int counterZero;

        System.out.println("Одномерные массивы. Задача №3");

        // Определим количество элементов массива случайным образом от 1 до 1000
        n = (int) (Math.random()*1000+1);       // +1 т.к. n не может быть равным нулю
        // Создадим и заполним массив значениями от 0 до 99999
        array = new double[n];
        for (int i=0; i<n; i++) {
            array[i] = Math.random()*100000;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        // Инициализируем счетчики
        counterPositive = 0;
        counterNegative = 0;
        counterZero = 0;
        // Произведем подсчет положительных, отрицательных и равных нулю элементов массива
        for (int i = 0; i<n; i++) {
            if (array[i] > 0) counterPositive++;
            else if (array[i] < 0) counterNegative++;
            else counterZero++;
        }
        // Вывод результата
        System.out.println("Массив, состоящий из " + array.length + " элементов, содержит " + counterPositive +
                 " положительных элементов, " + counterNegative + " отрицательных элементов и " + counterZero +
                " элементов, равных нулю.");
    }
}
