package ru.job4j.tracker;

import org.junit.Test;

import static org.junit.Assert.*;

public class PointTest {

    @Test
    public void whenX0Y0AndX0Y2Then2() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 2);
        double expected = 2.0;
        assertEquals(expected, a.distance(b), 0.1);
    }

    @Test
    public void whenX5Y8AndX9Y3Then6And40() {
        Point a = new Point(5, 8);
        Point b = new Point(9, 3);
        double expected = 6.40312;
        assertEquals(expected, a.distance(b), 0.00001);
    }

    @Test
    public void whenX0Y0AndX0Y0Then0() {
        Point a = new Point(0, 0);
        Point b = new Point(0, 0);
        double expected = 0.0;
        assertEquals(expected, a.distance(b), 0.1);
    }

    @Test
    public void whenX0Y0Z2AndX0Y2Z2Then2() {
        Point a = new Point(0, 0, 2);
        Point b = new Point(0, 2, 2);
        double expected = 2.0;
        assertEquals(expected, a.distance(b), 0.1);
    }

    @Test
    public void whenX4Y5Z8AndX2Y4Z6Then3() {
        Point a = new Point(5, 5, 8);
        Point b = new Point(2, 4, 6);
        double expected = 3.74;
        assertEquals(expected, a.distance3D(b), 0.01);
    }

    @Test
    public void whenX0Y0Z0AndX0Y0Z0Then0() {
        Point a = new Point(0, 0, 0);
        Point b = new Point(0, 0, 0);
        double expected = 0.0;
        assertEquals(expected, a.distance3D(b), 0.1);
    }
}