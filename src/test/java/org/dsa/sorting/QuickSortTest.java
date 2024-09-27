package org.dsa.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class QuickSortTest {

    @Test
    void testQuickSortBasicCase() {
        Sort<Integer> sortAlgo = new QuickSort<>();
        List<Integer> integers = new java.util.ArrayList<>(List.of(5, 3, 4, 6, 7, 3, 6, 1));
        int[] arr = sortAlgo.sort(integers);
        Collections.sort(integers);
        Assertions.assertArrayEquals(Arrays.stream(integers.toArray(new Integer[]{})).mapToInt(Integer::intValue).toArray(), arr);
    }

    @Test
    void testQuickSortBasicCase1() {
        Sort<Integer> sortAlgo = new QuickSort<>();
        List<Integer> integers = new java.util.ArrayList<>(List.of(5, 3, 4, 6, 7, 3, 6, 1,2,3,4,3,423,4,534,0,2,412,4,25,34,5,23,2,34,2,53,62));
        int[] arr = sortAlgo.sort(integers);
        Collections.sort(integers);
        Assertions.assertArrayEquals(Arrays.stream(integers.toArray(new Integer[]{})).mapToInt(Integer::intValue).toArray(), arr);
    }

    @Test
    void testQuickSortBasicCase2() {
        Sort<Integer> sortAlgo = new QuickSort<>();
        List<Integer> integers = new java.util.ArrayList<>(List.of(1,2,3,4,5,6,5,4,3,3,4,4,4,32,2,4,34,2,45,3,3,3,3,34,234,5,6,6,7,7,5,45,34,2,23,4,34,3));
        int[] arr = sortAlgo.sort(integers);
        Collections.sort(integers);
        Assertions.assertArrayEquals(Arrays.stream(integers.toArray(new Integer[]{})).mapToInt(Integer::intValue).toArray(), arr);
    }
}