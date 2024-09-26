package org.dsa.sorting;

import java.util.Collection;

public class SelectionSort<K> implements Sort<K>{
    @Override
    public Collection<K> sort(Collection<K> collection) {
        Object[] arr = collection.toArray();
        int size = collection.size();

        for (int i = 0; i < size; i++) {
            for (int j = i+1; j < size; j++) {
//                if(arr[i].)
            }
        }
        return null;
    }
}
