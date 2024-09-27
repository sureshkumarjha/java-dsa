package org.dsa.sorting;

import java.util.Collection;

public class InsertionSort<K extends Integer> implements Sort<K>{
    @Override
    public int[] sort(Collection<K> collection) {
        int[] arr = collection.stream().mapToInt(Integer::intValue).toArray();

        for (int i = 1; i < arr.length; i++) {
            for (int j = i-1; j >=0 ; j--) {
                if(arr[j+1] < arr[j]){
                    int temp = arr[j+1];
                    arr[j+1] = arr[j];
                    arr[j]= temp;
                }else{
                    break;
                }
            }
        }
        return arr;
    }
}
