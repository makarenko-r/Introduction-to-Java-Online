public class Part1_Task3 {
    public static void main(String[] args) {
        int arrayCounter;           // количество элементов массива
        double[] array;             // исходный массив
        int counterPositive = 0;
        int counterNegative = 0;
        int counterZero = 0;

        System.out.println("Одномерные массивы. Задача №3");

        // Определим количество элементов массива случайным образом от 1 до 1000
        arrayCounter = (int) (Math.random()*1000+1);       // +1 т.к. n не может быть равным нулю

        // Создадим и заполним массив значениями в интервале (-100000;100000)
        array = new double[arrayCounter];
        for (int i=0; i<arrayCounter; i++) {
            array[i] = Math.random()*100000;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        System.out.println("Создан массив действительных чисел с " + arrayCounter + " элементами в интервале (-100000;100000).");

        // Произведем подсчет положительных, отрицательных и равных нулю элементов массива
        for (int i = 0; i<arrayCounter; i++) {
            if (array[i] > 0) counterPositive++;
            else if (array[i] < 0) counterNegative++;
            else counterZero++;
        }

        // Вывод результата
        System.out.println("Созданный массив содержит " + counterPositive + " положительных элементов, " +
                counterNegative + " отрицательных элементов и " + counterZero + " элементов, равных нулю.");
    }
}