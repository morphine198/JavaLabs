package edu.lab11.quicksort;
import edu.lab11.insertion.Student;

public class TesterSort {
    public static void main(String[] args) {
        Student[] s = new Student[6];
        double[] GPA = new double[s.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
        }

        s[0].name = "Volodymyr"; s[1].name = "Anya"; s[2].name = "Dima";
        s[3].name = "Kirill"; s[4].name = "Max"; s[5].name = "Bogdan";
        GPA[0] = 3.87; GPA[1] = 2.67; GPA[2] = 3.33;
        GPA[3] = 4.87; GPA[4] = 4.01; GPA[5] = 5.00;

        SortingStudentsByGPA SSBGPA = new SortingStudentsByGPA();
        SSBGPA.quickSort(GPA, s, 0, s.length-1);

        for (int i = 0; i < s.length; i++) {
            System.out.println(GPA[i]+" "+s[i].name);
        }
    }
}
