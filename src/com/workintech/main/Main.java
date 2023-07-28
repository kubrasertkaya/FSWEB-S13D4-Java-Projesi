package com.workintech.main;

import com.workintech.model.Point;

public class Main {
    public static void main(String[] args) {
        Point first = new Point(6, 5);
        Point second = new Point(3, 1);
        Point third = new Point(-1, -3);
        System.out.println(first.distance(third));

        System.out.println("distance(0,0)= " + first.distance());
        System.out.println("distance(second)= " + first.distance(second));
        System.out.println("distance(2,2)= " + first.distance(2, 2));
        Point point = new Point(0, 0);
        System.out.println("distance()= " + point.distance());
    }
}