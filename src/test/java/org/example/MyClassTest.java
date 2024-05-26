package org.example;

import org.junit.Before;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MyClassTest {

    int a[];
    @BeforeEach
    public void setUp() {
        a = new int[] {1,2,3,4};
    }

    @AfterEach
    void tearDown() {
    }


    @Test
    void testSearchNoItem() {
        MyClass myClass = new MyClass();
        boolean val = myClass.search(a, 9);
        assertFalse(val);
    }

    @Test
    void testSearchHaveItem() {
        MyClass myClass = new MyClass();
        boolean val = myClass.search(a, 2);
        assertTrue(val);
    }
}