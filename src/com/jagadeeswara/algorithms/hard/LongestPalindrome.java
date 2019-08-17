package com.jagadeeswara.algorithms.hard;

public class LongestPalindrome {
    public static void main(String[] args){
        String str = "babad";
        System.out.println(longestPalindrome(str));
    }

    static String longestPalindrome(String str){
        int left =0;
        int right = 0;

        int length = str.length();

        boolean[][] isPalindrome = new boolean[length][length];

        for(int i=1;i<length;i++){
            for(int j=0;j<i;j++){

                if(str.charAt(i) == str.charAt(j) && (isPalindrome[j+1][i-1] || i-j<= 2)){
                    isPalindrome[j][i] = true;
                    if(right - left < i-j){
                        left = j;
                        right = i;
                    }
                }
            }
        }

        return str.substring(left,right+1);
    }
}
