package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenAddHasTwoParameters() {
        double first = 5.0;
        double second = 5.0;
        double rsl = new Max().add(first, second);
        double expected = 10.0;
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenAddHasThreeParameters() {
        double first = 5.0;
        double second = 5.0;
        double third = 5.0;
        double rsl = new Max().add(first, second, third);
        double expected = 15.0;
        assertEquals(expected, rsl, 0.01);
    }

    @Test
    public void whenAddHasFourthParameters() {
        double first = 5.0;
        double second = 5.0;
        double third = 5.0;
        double fourth = 5.0;
        double rsl = new Max().add(first, second, third, fourth);
        double expected = 20.0;
        assertEquals(expected, rsl, 0.01);
    }
}