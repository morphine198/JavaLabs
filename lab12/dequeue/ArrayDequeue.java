package edu.lab12.dequeue;

import java.util.ArrayDeque;

public class ArrayDequeue {
    public static String work(int[] word){
        String res = "";
        ArrayDeque<Integer> wordArray = new ArrayDeque<>();
        for(int i = 0; i<word.length;i++){
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

