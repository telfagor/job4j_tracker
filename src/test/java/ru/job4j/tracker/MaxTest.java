package ru.job4j.tracker;

import org.junit.Test;
import static org.junit.Assert.*;

public class MaxTest {

    @Test
    public void whenMaxHasTwoParameters() {
        double first = 5.0;
        double second = 6.0;
        double rsl = new Max().max(first, second);
        double expected = 6.0;
        assertEquals(expected, rsl, 0.1);
    }

    @Test
    public void whenMaxHasTwoEqualParameters() {
        double first = 0.0;
        double second = 0.0;
        double rsl = new Max().max(first, second);
        double expected = 0.0;
        assertEquals(expected, rsl, 0.1);
    }

    @Test
    public void whenMaxHasThreeParameters() {
        double first = 5.0;
        double second = 6.0;
        double third = 7.0;
        double rsl = new Max().max(first, second, third);
        double expected = 7.0;
        assertEquals(expected, rsl, 0.1);
    }

    @Test
    public void whenMaxHasFourthParameters() {
        double first = 5.0;
        double second = 6.0;
        double third = 7.0;
        double fourth = 8.0;
        double rsl = new Max().max(first, second, third, fourth);
        double expected = 8.0;
        assertEquals(expected, rsl, 0.1);
    }
}