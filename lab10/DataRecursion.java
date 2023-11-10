package edu.lab10;

public class DataRecursion {
    public byte max;
    public int count;
    public DataRecursion() {
        max = 0;
        count = 0;
    }
    @Override
    public String toString()
    {
        return Integer.toString(count);
    }
}
