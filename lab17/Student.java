package edu.lab17;

import java.util.Scanner;

class EmptyStringException extends Exception {
    public EmptyStringException(String message) {
        super(message);
    }
}

class StudentNotFoundException extends Exception {
    public StudentNotFoundException(String message) {
        super(message);
    }
}

class Student {
    private String iDNumber;
    private String fullName;

    public Student(String iDNumber, String fullName) {
        this.iDNumber = iDNumber;
        this.fullName = fullName;
    }

    public String getIDNumber() {
        return iDNumber;
    }

    public String getFullName() {
        return fullName;
    }

    public void setIDNumber(String iDNumber) {
        this.iDNumber = iDNumber;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    @Override
    public String toString() {
        return "Student{" +
                "iDNumber='" + iDNumber + '\'' +
                ", fullName='" + fullName + '\'' +
                '}';
    }
}

class LabClass {
    private Student[] students;
    private int size;

    public LabClass(int capacity) {
        students = new Student[capacity];
        size = 0;
    }

    public void addStudent(Student student) {
        students[size] = student;
        size++;
    }

    public Student[] getStudents() {
        return students;
    }

    public int getSize() {
        return size;
    }
}

class LabClassUI {
    private LabClass labClass;
    private Scanner scanner;

    public LabClassUI(int capacity) {
        labClass = new LabClass(capacity);
        scanner = new Scanner(System.in);
    }

    public void addStudent() {
        System.out.println("Enter student's ID number: ");
        String iDNumber = scanner.nextLine();
        System.out.println("Enter student's full name: ");
        String fullName = scanner.nextLine();

        try {
            if (iDNumber.isEmpty() || fullName.isEmpty()) {
                throw new EmptyStringException("Empty ID number or full name.");
            }

            Student student = new Student(iDNumber, fullName);
            labClass.addStudent(student);
            System.out.println("Student added successfully.");
        } catch (EmptyStringException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void searchStudent() {
        System.out.println("Enter student's full name: ");
        String fullName = scanner.nextLine();

        try {
            if (fullName.isEmpty()) {
                throw new EmptyStringException("Empty full name.");
            }

            Student[] students = labClass.getStudents();
            boolean found = false;

            for (int i = 0; i < labClass.getSize(); i++) {
                if (students[i].getFullName().equalsIgnoreCase(fullName)) {
                    System.out.println("Student found: " + students[i]);
                    found = true;
                    break;
                }
            }

            if (!found) {
                throw new StudentNotFoundException("Student not found.");
            }
        } catch (EmptyStringException | StudentNotFoundException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }

    public void sortStudentsByIDNumber() {
        Student[] students = labClass.getStudents();
        int n = labClass.getSize();

        for (int i = 1; i < n; i++) {
            Student key = students[i];
            int j = i - 1;

            while (j >= 0 && students[j].getIDNumber().compareTo(key.getIDNumber()) > 0) {
                students[j + 1] = students[j];
                j = j - 1;
            }

            students[j + 1] = key;
        }

        System.out.println("Students sorted by ID number.");
    }

    public void displayStudents() {
        Student[] students = labClass.getStudents();

        for (int i = 0; i < labClass.getSize(); i++) {
            System.out.println(students[i]);
        }
    }
}