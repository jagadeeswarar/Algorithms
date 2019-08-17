package com.jagadeeswara.algorithms.easy;

import java.util.HashMap;
import java.util.Map;

public class UniqueCharacter {
    public static void main(String[] args) {
        String s = "bbbb";
        System.out.println(firstUniqChar(s));
    }

    static int firstUniqChar(String s) {
        Map<Character,Integer> characters = new HashMap<>();
        for(int i=0;i<s.length();i++){
            if(characters.get(s.charAt(i))!= null){
                characters.put(s.charAt(i),-1);
            }else{
                characters.put(s.charAt(i),i);
            }
        }
        int returnVal = -1;
        for(int i: characters.values()){
            if(i != -1 && returnVal == -1 ){
                returnVal = i;
            } else
            if(i < returnVal  && i != -1){
                returnVal = i;
            }
        }
        return returnVal;
    }
}
