package org.dsa.sorting;

import java.util.Arrays;
import java.util.Collection;

public class BubbleSort<K extends Integer> implements Sort<K>{
    @Override
    public int[] sort(Collection<K> collection) {
        int[] arr = collection.stream().mapToInt(Integer::intValue).toArray();
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < arr.length-i-1; j++) {
                if(arr[j] > arr[j+1]){
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
        }
        return arr;
    }
}
