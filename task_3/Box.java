package ru.gb.jthree.hw_1.task_3;

import java.util.ArrayList;

public class Box<T extends Fruit> {

    public void addToBox(T a, Integer count){
       ArrayList <T> box = new ArrayList<T>();
        for (int i = 0; i < count; i++) {
            box.add(a);
        }
    }




    }
