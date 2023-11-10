package edu.lab11.quicksort;
import edu.lab11.insertion.Student;

public class SortingStudentsByGPA implements Comparator {
    public void quickSort(double[] arr, Student[] s, int begin, int end) {
        if (begin < end) {
            int partitionIndex = compare(arr, s, begin, end);

            quickSort(arr, s, begin, partitionIndex-1);
            quickSort(arr, s, partitionIndex+1, end);
        }
    }

    public int compare(double[] arr, Student[] s, int begin, int end) {
        double pivot = arr[end];
        int i = (begin-1);

        for (int j = begin; j < end; j++) {
            if (arr[j] >= pivot) {
                i++;

                double swapTemp = arr[i];
                Student swapTempS = s[i];
                arr[i] = arr[j];
                s[i] = s[j];
                arr[j] = swapTemp;
                s[j] = swapTempS;
            }
        }

        double swapTemp = arr[i+1];
        Student swapTempS = s[i+1];
        arr[i+1] = arr[end];
        s[i+1] = s[end];
        arr[end] = swapTemp;
        s[end] = swapTempS;

        return i+1;
    }
}
