package com.jagadeeswara.algorithms.hard;

enum Result {
    TRUE, FALSE
}

public class RegMatch {

    public static void main(String[] args) {
        System.out.println(isMatch("mississippi","mis*is*ip*."));
    }
    static Result[][] memo;
    public static boolean isMatch(String s, String p) {
        memo = new Result[s.length()+1][p.length()+1];
        return dp(0,0,s,p);
    }

    private static boolean dp(int i, int j, String str, String pat){
        if(memo[i][j] != null){
            return memo[i][j] == Result.TRUE;
        }
        boolean ans;
        if(j==pat.length()){
            return i == str.length();
        } else{
            boolean firstMatch = (i<str.length() && (pat.charAt(j) == str.charAt(i) || pat.charAt(j) == '.'));
            if(j+1 < pat.length() && pat.charAt(j+1) == '*'){
                ans = (dp(i,j+2,str,pat) || firstMatch && dp(i+1,j,str,pat));
            }else{
                ans = firstMatch && dp(i+1,j+1,str,pat);
            }
        }
    memo[i][j] = ans ? Result.TRUE: Result.FALSE;


        return ans;
    }
}
