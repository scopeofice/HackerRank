import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        char[] ch=A.toCharArray();
        char[] temp=new char[ch.length];
        int j=0;
        for(int i=ch.length-1;i>=0;i--){
            temp[j]=ch[i];
            j++;
        }
        for(int k=0;k<temp.length;k++){
            if(ch[k]!=temp[k]){
                System.out.println("No");
                System.exit(0);
            }
        }
        System.out.println("Yes");
    }
}



