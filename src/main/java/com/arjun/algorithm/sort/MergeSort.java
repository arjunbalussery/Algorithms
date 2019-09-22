package com.arjun.algorithm.sort;

public class MergeSort {
    private Integer[] array;

    public MergeSort(Integer[] array) {
        this.array = array;
    }

    public Object[] mergeSort () {
        int low=0;
        int hi = array.length;
        Integer[] aux = new Integer[hi];
        sort(low, hi-1, aux);
        return array;
    }

    private void sort(int low, int hi, Integer[] aux) {
        if (hi<=low) return;
        int mid = low + (hi-low)/2;
        sort(low, mid, aux);
        sort(mid+1, hi, aux);
        merge(low, mid, hi, aux);
    }

    private void merge(int low, int mid, int hi, Integer[] aux) {
        for (int i=low;i<=hi;i++) {
            aux[i]=array[i];
        }
        int i = low;
        int j = mid+1;
        for (int k=low; k <= hi; k++) {
            if (i>mid) array[k]=aux[j++];
            else if (j>hi) array[k]=aux[i++];
            else if (aux[i]> aux[j]) {
                array[k]=aux[j++];
            } else {
                array[k]=aux[i++];
            }
        }

    }

    private void sortBottomUp() {
        int low=0;
        int N= array.length;
        Integer[] aux = new Integer[N];
        for (int size=1;size<N;size=size+size) {
            for ()
        }
    }
}
