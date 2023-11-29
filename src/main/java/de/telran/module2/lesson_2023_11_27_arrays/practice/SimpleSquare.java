package de.telran.module2.lesson_2023_11_27_arrays.practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class SimpleSquare {
    static int[][] playArea = new int[][]{
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
            {0, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10},
    };

    static int[] firstCenter = new int []{1, 1};
    static int[] secondCenter = new int []{2, 1};

    public static void main(String[] args) {

        List<int[]> firstNeighbors = getNeighbors(playArea, firstCenter);
        List<int[]> secondNeighbors = getNeighbors(playArea, secondCenter);

//        showNeibors(firstNeighbors);
//        showNeibors(secondNeighbors);

        showIntersections(firstNeighbors, secondNeighbors);

    }
    public static void showIntersections(List<int[]> firstNeighbors, List<int[]> secondNeighbors) {

        for (int i = 0; i <firstNeighbors.size() ; i++ ) {
            for (int j = 0; j <secondNeighbors.size() ; j++ ) {
                int[] firstNum = firstNeighbors.get(i);
                int[] secondNum = secondNeighbors.get(j);
                if(firstNum[0] == secondNum[0] && firstNum[1] == secondNum[1] ) {
                    System.out.println(secondNeighbors.get(j)[0] + ", " + secondNeighbors.get(j)[1]);
                    System.out.println("======");
                }
            }
        }
    }


    public static void showNeibors(List<int[]> neighbors){
        for (int[] neighbor : neighbors) {
            System.out.println(Arrays.toString(neighbor));
        }
    }

    public static List<int[]> getNeighbors(int[][] playArea, int[] center) {
        List<int[]> neighbors = new ArrayList<>();
        int row = center[0]; // Индекс строки элемента
        int col = center[1]; // Индекс столбца элемента

        // Проверяем соседние элементы вокруг выбранного элемента
        for (int i = row - 1; i <= row + 1; i++) {
            for (int j = col - 1; j <= col + 1; j++) {
                // Проверяем, чтобы индексы были в пределах массива
                if (i >= 0 && i < playArea.length && j >= 0 && j < playArea[i].length) {
                    // Исключаем сам элемент [row][col]
                    if (!(i == row && j == col)) {
                        int[] neighbor = {i, j};
                        neighbors.add(neighbor);
                    }
                }
            }
        }
        return neighbors;
    }

}
