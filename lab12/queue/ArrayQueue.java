package edu.lab12.queue;

import java.util.LinkedList;

public class ArrayQueue {
    public static String work(int[] word){
        String res = "";
        LinkedList<Integer> wordArray = new LinkedList<>();
        for (int i = 0; i < word.length;i++){
            if(word[i]>0){
                wordArray.add(word[i]);
                res += ",0";
            }
            else if(word[i] == 0){
                if(wordArray.isEmpty()){
                    res += ",-1";
                }
                else{
                    res += "," + (int) wordArray.pop();
                }
            }
        }
        return res;
    }
}
