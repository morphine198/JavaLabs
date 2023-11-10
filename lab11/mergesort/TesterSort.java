package edu.lab11.mergesort;

public class TesterSort {
    public static void main(String[] args) {
        StudentMerge[] s = new StudentMerge[12];
        StudentMerge[] s1 = new StudentMerge[6];
        StudentMerge[] s2 = new StudentMerge[6];
        for (int i = 0; i < s.length; i++) {
            s[i] = new StudentMerge();
        }
        for (int i = 0; i < s1.length; i++) {
            s1[i] = new StudentMerge();
        }
        for (int i = 0; i < s2.length; i++) {
            s2[i] = new StudentMerge();
        }
        s1[0].name = "Volodymyr"; s1[1].name = "Anya"; s1[2].name = "Dima";
        s1[3].name = "Kirill"; s1[4].name = "Max"; s1[5].name = "Bogdan";
        s2[0].name = "Mark"; s2[1].name = "Yaroslav"; s2[2].name = "Oleg";
        s2[3].name = "Tarik"; s2[4].name = "Pasha"; s2[5].name = "Geisha";
        s1[0].id = 3; s1[1].id = 0; s1[2].id = 2;
        s1[3].id = 5; s1[4].id = 1; s1[5].id = 4;
        s2[0].id = 6; s2[1].id = 9; s2[2].id = 11;
        s2[3].id = 10; s2[4].id = 8; s2[5].id = 7;
        MergeSort.merge(s, s1, s2, s.length/2, s.length - s.length/2);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].id+" "+s[i].name);
        }
        System.out.println(" ");
        MergeSort.mergeSort(s, s.length);
        for (int i = 0; i < s.length; i++) {
            System.out.println(s[i].id+" "+s[i].name);
        }
    }
}
