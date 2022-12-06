public class Part1_Task2 {
    public static void main(String[] args) {
        int arrayCounter;           // количество элементов массива
        double[] array;             // исходный массив
        double numberZ;
        int replacementCounter = 0;

        System.out.println("Одномерные массивы. Задача №2");

        // Определим количество элементов массива случайным образом от 1 до 1000
        arrayCounter = (int) (Math.random()*1000+1);       // +1 т.к. n не может быть равным нулю

        // Создадим и заполним массив значениями в интервале (-100000;100000)
        array = new double[arrayCounter];
        for (int i=0; i<arrayCounter; i++) {
            array[i] = Math.random()*100000;
            if (Math.random()<0.5) array[i]*=(-1);      // добавим случайным образом в массив отрицательные элементы
        }
        System.out.println("Создан массив действительных чисел с " + arrayCounter + " элементами в интервале (-100000;100000).");

        // Определим случайным образом заданное Z в интервале (-100000;100000)
        numberZ = (Math.random()*100000);
        if (Math.random()<0.5) numberZ*=(-1);                 // добавим случайным образом "-"
        System.out.println("Создано заданное число Z в интервале (-100000;100000), Z = " + numberZ + ".");

        // Произведем замену элементов массива, которые больше Z, и подсчитаем количество замен
        for (int i = 0; i<arrayCounter; i++) {
            if (array[i] > numberZ) {
                array[i] = numberZ;
                replacementCounter++;
            }
        }

        // Вывод результата
        System.out.println("Количество элементов массива, состоящего из " + array.length +
                " элементов, больших, чем " + numberZ + " и количество соответствующих замен: " + replacementCounter + "." );
    }
}