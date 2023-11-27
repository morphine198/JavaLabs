package edu.lab12.stack;

import java.util.Stack;

public class ArrayStack {
    public static String work(int[] word){
        String res = "";
        Stack<Integer> wordArray = new Stack<>();
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
                    res += "," + (int) wordArray.remove(0);
                }
            }
        }
        return res;
    }
}
