import java.util.Arrays;

public class Part2_Task16_MagicSquareNotOptimized {
    public static void main(String[] args) {
        // Решение задачи для магического квадрата 4 порядка
        // Определение количества уникальных комбинаций
        int count = 0;
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 16; j++) {
                for (int k = 1; k <= 16; k++) {
                    for (int l = 1; l <= 16; l++) {
                        if (((i+j+k+l) == 34) && i!=j && i!=k && i!=l && j!=k && j!=l && k!=l) count++;
                    }
                }
            }
        }
        System.out.println("Количество уникальных комбинаций составляет: " + count + ".");
        // Создание двумерного массива с уникальными комбинациями для последующего
        int [] [] fullMatrix = new int[count][4];
        count = 0;
        for (int i = 1; i <= 16; i++) {
            for (int j = 1; j <= 16; j++) {
                for (int k = 1; k <= 16; k++) {
                    for (int l = 1; l <= 16; l++) {
                        if (((i+j+k+l) == 34) && i!=j && i!=k && i!=l && j!=k && j!=l && k!=l) {
                            int[] helpMatrix = {i,j,k,l};
                            fullMatrix[count] = helpMatrix;
                            count++;
                        }
                    }
                }
            }
        }

/*
        // only for test
        System.out.println(fullMatrix.length);
        for (int i = 0; i < fullMatrix.length; i++) {
            System.out.println("Элемент массива № " + i + ": " + Arrays.toString(fullMatrix[i]) + ".");
        }
*/

       // Перебор и печать всех вариантов матриц, удовлетворяющих условиям магического квадрата 4 порядка
        count = 0;
        for (int i = 0; i < fullMatrix.length; i++) {
            for (int j = 0; j < fullMatrix.length; j++) {
                for (int k = 0; k < fullMatrix.length; k++) {
                    for (int l = 0; l < fullMatrix.length; l++) {
                        if ((fullMatrix[i][0]+fullMatrix[j][0]+fullMatrix[k][0]+fullMatrix[l][0]) == 34 &&
                                (fullMatrix[i][1]+fullMatrix[j][1]+fullMatrix[k][1]+fullMatrix[l][1]) == 34 &&
                                (fullMatrix[i][2]+fullMatrix[j][2]+fullMatrix[k][2]+fullMatrix[l][2]) == 34 &&
                                (fullMatrix[i][3]+fullMatrix[j][3]+fullMatrix[k][3]+fullMatrix[l][3]) == 34 &&
                                (fullMatrix[i][0]+fullMatrix[j][1]+fullMatrix[k][2]+fullMatrix[l][3]) == 34 &&
                                (fullMatrix[i][3]+fullMatrix[j][2]+fullMatrix[k][1]+fullMatrix[l][0]) == 34 &&

                                fullMatrix[i][0]!=fullMatrix[j][0] && fullMatrix[i][0]!=fullMatrix[j][1] &&
                                fullMatrix[i][0]!=fullMatrix[j][2] && fullMatrix[i][0]!=fullMatrix[j][3] &&
                                fullMatrix[i][0]!=fullMatrix[k][0] && fullMatrix[i][0]!=fullMatrix[k][1] &&
                                fullMatrix[i][0]!=fullMatrix[k][2] && fullMatrix[i][0]!=fullMatrix[k][3] &&
                                fullMatrix[i][0]!=fullMatrix[l][0] && fullMatrix[i][0]!=fullMatrix[l][1] &&
                                fullMatrix[i][0]!=fullMatrix[l][2] && fullMatrix[i][0]!=fullMatrix[l][3] &&
                                fullMatrix[i][1]!=fullMatrix[j][0] && fullMatrix[i][1]!=fullMatrix[j][1] &&
                                fullMatrix[i][1]!=fullMatrix[j][2] && fullMatrix[i][1]!=fullMatrix[j][3] &&
                                fullMatrix[i][1]!=fullMatrix[k][0] && fullMatrix[i][1]!=fullMatrix[k][1] &&
                                fullMatrix[i][1]!=fullMatrix[k][2] && fullMatrix[i][1]!=fullMatrix[k][3] &&
                                fullMatrix[i][1]!=fullMatrix[l][0] && fullMatrix[i][1]!=fullMatrix[l][1] &&
                                fullMatrix[i][1]!=fullMatrix[l][2] && fullMatrix[i][1]!=fullMatrix[l][3] &&
                                fullMatrix[i][2]!=fullMatrix[j][0] && fullMatrix[i][2]!=fullMatrix[j][1] &&
                                fullMatrix[i][2]!=fullMatrix[j][2] && fullMatrix[i][2]!=fullMatrix[j][3] &&
                                fullMatrix[i][2]!=fullMatrix[k][0] && fullMatrix[i][2]!=fullMatrix[k][1] &&
                                fullMatrix[i][2]!=fullMatrix[k][2] && fullMatrix[i][2]!=fullMatrix[k][3] &&
                                fullMatrix[i][2]!=fullMatrix[l][0] && fullMatrix[i][2]!=fullMatrix[l][1] &&
                                fullMatrix[i][2]!=fullMatrix[l][2] && fullMatrix[i][2]!=fullMatrix[l][3] &&
                                fullMatrix[i][3]!=fullMatrix[j][0] && fullMatrix[i][3]!=fullMatrix[j][1] &&
                                fullMatrix[i][3]!=fullMatrix[j][2] && fullMatrix[i][3]!=fullMatrix[j][3] &&
                                fullMatrix[i][3]!=fullMatrix[k][0] && fullMatrix[i][3]!=fullMatrix[k][1] &&
                                fullMatrix[i][3]!=fullMatrix[k][2] && fullMatrix[i][3]!=fullMatrix[k][3] &&
                                fullMatrix[i][3]!=fullMatrix[l][0] && fullMatrix[i][3]!=fullMatrix[l][1] &&
                                fullMatrix[i][3]!=fullMatrix[l][2] && fullMatrix[i][3]!=fullMatrix[l][3] &&

                                fullMatrix[j][0]!=fullMatrix[k][0] && fullMatrix[j][0]!=fullMatrix[k][1] &&
                                fullMatrix[j][0]!=fullMatrix[k][2] && fullMatrix[j][0]!=fullMatrix[k][3] &&
                                fullMatrix[j][0]!=fullMatrix[l][0] && fullMatrix[j][0]!=fullMatrix[l][1] &&
                                fullMatrix[j][0]!=fullMatrix[l][2] && fullMatrix[j][0]!=fullMatrix[l][3] &&
                                fullMatrix[j][1]!=fullMatrix[k][0] && fullMatrix[j][1]!=fullMatrix[k][1] &&
                                fullMatrix[j][1]!=fullMatrix[k][2] && fullMatrix[j][1]!=fullMatrix[k][3] &&
                                fullMatrix[j][1]!=fullMatrix[l][0] && fullMatrix[j][1]!=fullMatrix[l][1] &&
                                fullMatrix[j][1]!=fullMatrix[l][2] && fullMatrix[j][1]!=fullMatrix[l][3] &&
                                fullMatrix[j][2]!=fullMatrix[k][0] && fullMatrix[j][2]!=fullMatrix[k][1] &&
                                fullMatrix[j][2]!=fullMatrix[k][2] && fullMatrix[j][2]!=fullMatrix[k][3] &&
                                fullMatrix[j][2]!=fullMatrix[l][0] && fullMatrix[j][2]!=fullMatrix[l][1] &&
                                fullMatrix[j][2]!=fullMatrix[l][2] && fullMatrix[j][2]!=fullMatrix[l][3] &&
                                fullMatrix[j][3]!=fullMatrix[k][0] && fullMatrix[j][3]!=fullMatrix[k][1] &&
                                fullMatrix[j][3]!=fullMatrix[k][2] && fullMatrix[j][3]!=fullMatrix[k][3] &&
                                fullMatrix[j][3]!=fullMatrix[l][0] && fullMatrix[j][3]!=fullMatrix[l][1] &&
                                fullMatrix[j][3]!=fullMatrix[l][2] && fullMatrix[j][3]!=fullMatrix[l][3] &&

                                fullMatrix[k][0]!=fullMatrix[l][0] && fullMatrix[k][0]!=fullMatrix[l][1] &&
                                fullMatrix[k][0]!=fullMatrix[l][2] && fullMatrix[k][0]!=fullMatrix[l][3] &&
                                fullMatrix[k][1]!=fullMatrix[l][0] && fullMatrix[k][1]!=fullMatrix[l][1] &&
                                fullMatrix[k][1]!=fullMatrix[l][2] && fullMatrix[k][1]!=fullMatrix[l][3] &&
                                fullMatrix[k][2]!=fullMatrix[l][0] && fullMatrix[k][2]!=fullMatrix[l][1] &&
                                fullMatrix[k][2]!=fullMatrix[l][2] && fullMatrix[k][2]!=fullMatrix[l][3] &&
                                fullMatrix[k][3]!=fullMatrix[l][0] && fullMatrix[k][3]!=fullMatrix[l][1] &&
                                fullMatrix[k][3]!=fullMatrix[l][2] && fullMatrix[k][3]!=fullMatrix[l][3])
                                {
                            count++;
                            System.out.println("Магический квадрат 4 порядка №"+count);
                            System.out.println(Arrays.toString(fullMatrix[i]));
                            System.out.println(Arrays.toString(fullMatrix[j]));
                            System.out.println(Arrays.toString(fullMatrix[k]));
                            System.out.println(Arrays.toString(fullMatrix[l]));
                        }
                    }
                }
            }
        }
        System.out.println("FINISH");
    }
}