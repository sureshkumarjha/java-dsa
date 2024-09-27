package org.dsa.sorting;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    void testSelectionSort() {
        Sort<Integer> sortAlgo = new SelectionSort<>();
        List<Integer> integers = new java.util.ArrayList<>(List.of(5, 3, 4, 6, 7, 3, 6, 1));
        int[] arr = sortAlgo.sort(integers);
        Collections.sort(integers);
        Assertions.assertArrayEquals(Arrays.stream(integers.toArray(new Integer[]{})).mapToInt(Integer::intValue).toArray(), arr);
    }
}