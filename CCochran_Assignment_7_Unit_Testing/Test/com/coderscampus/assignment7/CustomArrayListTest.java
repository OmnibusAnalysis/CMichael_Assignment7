package com.coderscampus.assignment7;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    CustomList<Object> sut = new CustomArrayList<>();

    @Test
    void return_size() {
        sut.add(100);
        assertEquals(1, sut.getSize());
    }

    @Test
    void add_one_item() {
        sut.add(5);

        assertEquals(5, sut.get(0));
        assertEquals(1, sut.getSize());
    }

    @Test
    void add_alot() {
        for (int i = 0; i < 5150; i++) {
            sut.add(i);
        }
        assertEquals(5150, sut.getSize());
    }

    @Test
    void remove_item() {
        for (int i = 0; i <= 30; i++) {
            sut.add(i);
        }

        sut.remove(5);
        sut.remove(3);
        assertEquals(29, sut.getSize());
    }

    @Test
    void throw_IOB_Exception() {
        for (int i = 0; i <= 789000; i++) {
            sut.add(i);
        }

        assertThrows(IndexOutOfBoundsException.class, () -> sut.get(-54));
    }
}