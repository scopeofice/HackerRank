import java.util.Scanner;

public class Solution {

    static boolean isAnagram(String a, String b) {
        // Complete the function
        if(a.length()==b.length()){
        a=a.toLowerCase();
        b=b.toLowerCase();
        char[] ch1=a.toCharArray();
        char[] ch2=b.toCharArray();
        java.util.Arrays.sort(ch1);
        java.util.Arrays.sort(ch2);
        for(int i=0;i<ch1.length;i++){
        if(ch1[i] != ch2[i]){
            return false;
        }
    }
        }else {
            return false;
        }
        return true;
}
