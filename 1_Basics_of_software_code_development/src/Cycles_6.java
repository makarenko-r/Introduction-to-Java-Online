public class Cycles_6 {

    public static void main(String[] args) {
        char ch = 0;
        System.out.println("Циклы. Задача №6.");
        for (int i = 0; i <= 65535; i++) {
            ch = (char) i;
            System.out.println("Порядковый номер символа по кодировке ASCII - " + i + " Обозначение - " + ch);
        }
    }
}
