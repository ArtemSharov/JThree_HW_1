package ru.gb.jthree.hw_1.task_3;

import java.util.ArrayList;

public class Box<T extends Fruit> extends ArrayList {
    ArrayList <T> box = new ArrayList<T>();

    public static <T> T addToBox(Box b,T a, Integer count){
        for (int i = 0; i < count; i++) {
            b.add(a);
        }
        return (T) b;
    }
    public static <T> T getWeight(Box b){
        float weightBox = 0;
        for (Object fruit: b) {
            weightBox +=Fruit.getWeightFruit; //почему не доступен метод класса фрукт?
        }
    }





    }
