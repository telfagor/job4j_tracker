package ru.job4j.tracker;

import java.util.Arrays;

public class Tracker {
    private final Item[] items = new Item[100];
    private int ids = 1;
    private int size = 0;

    public Item add(Item item) {
        item.setId(ids++);
        items[size++] = item;
        return item;
    }

    public Item findById(int id) {
        Item rsl = null;
        for (int index = 0; index < size; index++) {
            Item item = items[index];
            if (item.getId() == id) {
                rsl = item;
                break;
            }
        }
        return rsl;
    }

    public Item[] findAll() {
        Item rsl = null;
        int size = 0;
        for (int i = 0; i < items.length; i++) {
            if (items[i] != null) {
                items[size] = items[i];
                size++;
            }
        }
        return Arrays.copyOf(items, size);
    }

    public Item[] findByName(String key) {
        Item[] array = new Item[size];
        int index = 0;
        for (int i = 0; i < size; i++) {
            if (key.equals(items[i].getName())) {
                array[index] = items[i];
                index++;
            }
        }
        return Arrays.copyOf(array, index);
    }
}