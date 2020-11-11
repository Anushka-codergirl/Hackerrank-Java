import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        String A=sc.next();
        String B=sc.next();
        /* Enter your code here. Print output to STDOUT. */
        int lenA = A.length();
        int lenB = B.length();
        //Sum of length
        System.out.println(A.length()+B.length());
        String fLA = A.substring(0, 1);
        fLA = fLA.toUpperCase();
        String rLA = A.substring(1, A.length());
        A = fLA + rLA;
        String fLB = B.substring(0, 1);
        fLB = fLB.toUpperCase();
        String rLB = B.substring(1, B.length());
        B = fLB + rLB;
        
        if(B.compareTo(A)<0){
            System.out.println("Yes");
        }
        else{
            System.out.println("No");
        }
        
        //Letter combination
        System.out.println(A + " " + B);
    }
}



