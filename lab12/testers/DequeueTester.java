package edu.lab12.testers;

import static edu.lab12.dequeue.ArrayDequeue.work;

public class DequeueTester {
    public static void main(String[] args) {
        int[] word = new int[]{0,1,8,4,0,3,0,8,8,3,7} ;
        System.out.println(work(word));
    }
}
