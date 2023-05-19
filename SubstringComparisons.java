import java.util.Scanner;

public class Solution {

    public static String getSmallestAndLargest(String s, int k) {
        String smallest = "";
        String largest = "";
    
        largest=s.substring(0,k);
        smallest=s.substring(0,k);
        for(int i=0;i<s.length()-k+1;i++){
            String str=s.substring(i,k+i);
            if(largest.compareTo(str)<0){
                largest=str;
            }
            if(smallest.compareTo(str)>0){
                smallest=str;
            }
        } 
    return smallest + "\n" + largest;
}

