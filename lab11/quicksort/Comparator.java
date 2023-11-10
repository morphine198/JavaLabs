package edu.lab11.quicksort;
import edu.lab11.insertion.Student;

public interface Comparator {
    int compare(double arr[], Student s[], int begin, int end);
}