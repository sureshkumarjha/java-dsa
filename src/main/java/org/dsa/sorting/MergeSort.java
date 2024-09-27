package org.dsa.sorting;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class MergeSort<K extends Integer> implements Sort<K>{
    @Override
    public int[] sort(Collection<K> collection) {
        int[] arr = collection.stream().mapToInt(Integer::intValue).toArray();
        mergeSort(0, arr.length-1, arr);
        return arr;
    }

    private void mergeSort(int start, int end, int[] arr){
        if(start == end) return;
        int mid = (int)(start+end)/2;
        mergeSort(start,mid, arr);
        mergeSort(mid+1,end, arr);
        merge(start, mid, end, arr);
    }

    private void merge(int start,int mid, int end, int[] arr){
        List<Integer> temp = new ArrayList<>();
        int i = start;
        int j = mid+1;

        while(i<=mid && j<=end){
            if(arr[i]< arr[j]){
                temp.add(arr[i]);
                i++;
            }else{
                temp.add(arr[j]);
                j++;
            }
        }
        while(i<=mid){
            temp.add(arr[i]);
            i++;
        }

        while(j<=end){
            temp.add(arr[j]);
            j++;
        }
        for (int k = start; k <= end; k++) {
            arr[k] = temp.get(k-start);
        }
    }
}
