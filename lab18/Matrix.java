package edu.lab18;

public class Matrix<T> {
    private T[][] matrix;

    public Matrix(T[][] matrix) {
        this.matrix = matrix;
    }

    public T getElement(int row, int col) {
        return matrix[row][col];
    }

    public void setElement(int row, int col, T value) {
        matrix[row][col] = value;
    }

    public void printMatrix() {
        for (T[] row : matrix) {
            for (T element : row) {
                System.out.print(element + " ");
            }
            System.out.println();
        }
    }
}
