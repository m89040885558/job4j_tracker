package ru.job4j.oop;

import org.junit.Assert;
import org.junit.Test;

public class PointTest {

    @Test
    public void distance() {
        Point a = new Point(4, 2);
        Point b = new Point(0, 2);
        double actual = a.distance(b);
        double expect = 4.0;
        Assert.assertEquals(expect, actual, 0.1);
    }

    @Test
    public void distance3D() {
        Point a = new Point(4, 2, 5);
        Point b = new Point(0, 2, 2);
        double actual = a.distance3D(b);
        double expect = 5.0;
        Assert.assertEquals(expect, actual, 0.1);
    }
}