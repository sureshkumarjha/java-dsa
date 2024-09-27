package org.dsa.sorting;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

public class SelectionSort<K extends Integer> implements Sort<K>{

    @Override
    public int[] sort(Collection<K> collection) {
        int[] arr = Arrays.stream(collection.toArray(new Integer[]{}))
                .mapToInt(Integer::intValue).toArray();
        int size = collection.size();

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
                if(arr[j] < arr[i]){
                    arr[i] = arr[i] + arr[j];
                    arr[j] = arr[i] - arr[j];
                    arr[i] = arr[i] - arr[j];
                }
            }
        }
        return arr;
    }
}
