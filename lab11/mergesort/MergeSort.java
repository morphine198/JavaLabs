package edu.lab11.mergesort;

public class MergeSort {
    public static void mergeSort(StudentMerge[] s, int n) {
        if (n < 2) {
            return;
        }
        int mid = n / 2;
        StudentMerge[] l = new StudentMerge[mid];
        for (int init = 0; init < l.length; init++) {
            l[init] = new StudentMerge();
        }
        StudentMerge[] r = new StudentMerge[n - mid];
        for (int init = 0; init < r.length; init++) {
            r[init] = new StudentMerge();
        }

        for (int i = 0; i < mid; i++) {
            l[i].name = s[i].name;
            l[i].id = s[i].id;
        }
        for (int i = mid; i < n; i++) {
            r[i - mid].name = s[i].name;
            r[i - mid].id = s[i].id;
        }
        mergeSort(l, mid);
        mergeSort(r, n - mid);

        merge(s, l, r, mid, n - mid);
    }
    public static void merge(StudentMerge[] s, StudentMerge[] l, StudentMerge[] r, int left, int right) {

        int i = 0, j = 0, k = 0;
        while (i < left && j < right) {
            if (l[i].id <= r[j].id) {
                s[k].name = l[i].name;
                s[k++].id = l[i++].id;
            }
            else {
                s[k].name = r[j].name;
                s[k++].id = r[j++].id;
            }
        }
        while (i < left) {
            s[k].name = l[i].name;
            s[k++].id = l[i++].id;
        }
        while (j < right) {
            s[k].name = r[j].name;
            s[k++].id = r[j++].id;
        }
    }

}
