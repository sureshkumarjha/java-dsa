package org.dsa.sorting;

import java.util.Collection;

public class QuickSort <K extends Integer> implements Sort<K>{

    public int[] sort(Collection<K> collection) {
        int[] arr = collection.stream().mapToInt(Integer::intValue).toArray();
        quickSort(0, arr.length-1, arr);
        return arr;
    }

    private void quickSort(int start, int end, int[] arr){
        if(start >= end) return;
        int pvtIdx = pivotPartition(start, end, arr);
        quickSort(start, pvtIdx-1, arr);
        quickSort(pvtIdx+1, end, arr);
    }

    private int pivotPartition(int start, int end, int[] arr){
        int pivot = arr[start];
        int i = start+1;
        int j = end;

        while(i <= j){
            if(arr[i] <= pivot){
                i++;
                continue;
            }
            if(arr[j] > pivot){
                j--;
                continue;
            }
            if(i<= end && j>= start){
                swap(arr, i, j);
            }
        }
        swap(arr, i-1, start);
        return i-1;
    }

    private void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j]= temp;
    }
}
