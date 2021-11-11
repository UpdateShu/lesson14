package ru.geekbrains.lessons;

import org.junit.Test;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;

public class MainTests {

    @Test
    public void testNotArr() {
        int[] arr = null;
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.getMassAfter4(arr));
    }

    @Test
    public void testNot4Arr() {
        int[] arr = { 1, 2, 7, 6 };
        Assertions.assertThrows(RuntimeException.class, () -> MainApp.getMassAfter4(arr));
    }

    @Test
    public void testLast4Arr() {
        int[] arr = { 1, 2, 2, 3, 1, 7, 4 };
        int[] arr1 = new int[0];
        Assertions.assertArrayEquals(arr1, MainApp.getMassAfter4(arr) );
    }

    @Test
    public void testRightArr() {
        int[] arr = { 1, 2, 4, 4, 2, 3, 4, 1, 7 };
        int[] arr1 = { 1, 7 };
        Assertions.assertArrayEquals(arr1, MainApp.getMassAfter4(arr) );
    }

    @Test
    public void testNotOnly1And4() {
        int[] arr = { 1, 1, 1, 4, 4, 1, 4, 4, 3};
        Assertions.assertFalse(MainApp.isArrayFrom1And4(arr));
    }

    @Test
    public void testOnly4() {
        int[] arr = { 4, 4, 4, 4,};
        Assertions.assertFalse(MainApp.isArrayFrom1And4(arr));
    }

    @Test
    public void testOnly1Arr() {
        int[] arr = { 1, 1, 1, 1 };
        Assertions.assertFalse(MainApp.isArrayFrom1And4(arr));
    }

    @Test
    public void test1And4Arr() {
        int[] arr = { 1, 1, 1, 4, 4, 1, 4, 4,};
        Assertions.assertTrue(MainApp.isArrayFrom1And4(arr));
    }
}
