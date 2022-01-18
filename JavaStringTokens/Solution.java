import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String s = scan.nextLine();
        // Write your code here.
        String[] newStr = s.split("[ .,'!?]+");
        System.out.println(newStr.length);
        
        for(int i = 0; i< newStr.length; i++){
            System.out.println(newStr[i]);
        }
        scan.close();
    }
}

