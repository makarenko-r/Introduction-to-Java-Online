public class Part1_Task1 {
    public static void main(String[] args) {
        int arrayCounter;         // количество элементов массива
        int[] array;            // исходный массив
        int numberK;
        int sum = 0;

        System.out.println("Одномерные массивы. Задача №1");

        // Определим количество элементов массива случайным образом от 1 до 1000
        arrayCounter = (int) (Math.random()*1000+1);       // +1 т.к. n не может быть равным нулю

        // Создадим и заполним массив значениями в интервале [1;100000]
        array = new int[arrayCounter];
        for (int i=0; i<arrayCounter; i++) {
            array[i] = (int) (Math.random()*100000+1);
        }
        System.out.println("Создан массив натуральных чисел с " + arrayCounter + " элементами в интервале [1;100000].");

        // Определим случайным образом заданное K в интервале [1;100]
        numberK = (int) (Math.random()*100+1);
        System.out.println("Создано заданное число K в интервале [1;100], K = " + numberK + ".");

        // Произведем подсчет суммы элементов массива, кратных K
        for (int temp: array) {
            if ((temp % numberK) == 0) sum+=temp;
        }
        // Вывод результата
        System.out.println("Сумма элементов массива, состоящего из " + array.length +
                " элементов массива, кратных " + numberK + " равна: " + sum + "." );
    }
}