package ru.gb.jthree.hw_1.task_1;

import java.util.Arrays;

//1. Написать метод, который меняет два элемента массива местами.(массив может быть любого ссылочного типа);
public class Method{
    public static <T> T changeArr(T arr[], int a, int b){
        T temp;
        temp = arr[a];
        arr[a] = arr[b];
        arr[b] = temp;
        return (T) arr;
    }
    public static void main(String[] args) {
        Integer[] arr1 = {1, 4, 6, 2, 7};
        changeArr(arr1, 1,4);
        System.out.println(Arrays.toString(arr1));

        String[] arr2 = {"1", "4", "6" , "2", "7"};
        changeArr(arr2, 2,0);
        System.out.println(Arrays.toString(arr2));
    }
}
