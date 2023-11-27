package edu.lab12.doublelist;

import java.util.ArrayList;

public class ArrayDoubleList {
    public static String work(int[] word){
        String res = "";
        ArrayList<Integer> wordArray = new ArrayList<>();
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
