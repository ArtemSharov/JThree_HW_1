package ru.gb.jthree.hw_1.task_2;

import java.util.ArrayList;
import java.util.Arrays;

//2. Написать метод, который преобразует массив в ArrayList;
public class ArrayToList {
public static <T> T arrayToList(T arr[]){
    ArrayList <T> arrayList = new ArrayList<T>();
    for (int i = 0; i < arr.length; i++) {
        arrayList.add(arr[i]);
    }
    return (T) arrayList;
}

    public static void main(String[] args) {
      Integer [] a = {1, 2, 3};
      arrayToList(a);
             System.out.println(Arrays.toString(a));
    }
}
