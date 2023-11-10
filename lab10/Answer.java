package edu.lab10;

public class Answer {
    int max;
    int count;
    public Answer(int max_, int count_)
    {
        max = max_;
        count = count_;
    }
    @Override
    public String toString()
    {
        return Integer.toString(count - 1);
    }
}
