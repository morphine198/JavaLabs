package edu.lab11.insertion;

public class TesterSort {
    public static void insertionSort(int[] input, Student[] inputS) {
        for (int i = 1; i < input.length; i++) {
            int key = input[i];
            Student keyS = inputS[i];
            int j = i - 1;
            while (j >= 0 && input[j] > key) {
                input[j + 1] = input[j];
                inputS[j + 1] = inputS[j];
                j = j - 1;
            }
            input[j + 1] = key;
            inputS[j + 1] = keyS;
        }
    }

    public static void main(String[] args) {
        Student[] s = new Student[6];
        int[] IDNumber = new int[s.length];
        for (int i = 0; i < s.length; i++) {
            s[i] = new Student();
        }

        s[0].name = "Volodymyr"; s[1].name = "Anya"; s[2].name = "Dima";
        s[3].name = "Kirill"; s[4].name = "Max"; s[5].name = "Bogdan";
        IDNumber[0] = 3; IDNumber[1] = 0; IDNumber[2] = 2;
        IDNumber[3] = 5; IDNumber[4] = 1; IDNumber[5] = 4;

        insertionSort(IDNumber, s);

        for (int i = 0; i < s.length; i++) {
            System.out.println(IDNumber[i]+" "+s[i].name);
        }
    }
}
