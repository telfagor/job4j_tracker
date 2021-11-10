package ru.job4j.tracker;

import org.junit.Test;
import org.junit.Assert;
import static org.hamcrest.Matchers.is;

public class BatteryTest {

    @Test
    public void whenThis30Another50ThenAnotherLoadEqual80() {
        Battery charger = new Battery(30);
        Battery another = new Battery(50);
        charger.exchange(another);
        int expected = 80;
        Assert.assertThat(expected, is(another.getLoad()));
    }

    @Test
    public void whenThis80Another20ThenThisLoadEqual0() {
        Battery charger = new Battery(80);
        Battery another = new Battery(20);
        charger.exchange(another);
        int expected = 0;
        Assert.assertThat(expected, is(charger.getLoad()));
    }

    @Test
    public void whenThis95Another0ThenAnotherLoadEqual95() {
        Battery charger = new Battery(95);
        Battery another = new Battery(0);
        charger.exchange(another);
        int expected = 95;
        Assert.assertThat(expected, is(another.getLoad()));
    }
}