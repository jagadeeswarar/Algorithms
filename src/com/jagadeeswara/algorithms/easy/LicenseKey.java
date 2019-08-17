package com.jagadeeswara.algorithms.easy;

public class LicenseKey {
    public static void main(String[] args) {
        String S = "5F3Z-2e-9-w";
        int K = 4;

        System.out.println(licenseKeyFormatting(S,K));
    }

    public static String licenseKeyFormatting(String S, int K) {
        StringBuilder returnStr = new StringBuilder();
        int count = 0;
        S = S.toUpperCase();
        for(int i=S.length()-1;i>=0;i--){
            if(S.charAt(i) != '-'){
                returnStr.append(S.charAt(i));
                count++;
                if(count%K ==0 && i!=0) returnStr.append('-');
            }else{
                if(i==0 && count%K ==0) returnStr.deleteCharAt(returnStr.length()-1);
            }
        }

        return returnStr.reverse().toString();
    }
}
