package edu.lab14.testers;

import edu.lab14.waitlists.UnfairWaitList;

public class TesterWaitList {
    public static void main(String[] args) {
        var afs = new UnfairWaitList(4);
        afs.add(4);
        afs.add(4);
        afs.add(2);
        afs.add(1);
        System.out.println(afs);
        System.out.println(afs.getCapacity());
    }
}