package org.dsa.sorting;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
    @Test
    void testSelectionSort(){
        Sort<Integer> sortAlgo = new SelectionSort<>();
        sortAlgo.sort(List.of(1,2,3,4,5));
    }
}