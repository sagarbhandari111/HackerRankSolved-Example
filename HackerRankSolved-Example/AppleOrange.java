import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the countApplesAndOranges function below.
    static void countApplesAndOranges(int s, int t, int a, int b, int[] apples, int[] oranges) {
        int ctr=0,i,len,ctr1=0,a1,a2;
        len=apples.length;
        int len2=oranges.length;
         //  System.out.println(s);
       //    System.out.println(t);
        for(i=0;i<len;i++){
            a1=0;
            if(apples[i]>0){
              //  System.out.println(apples[i]);
                a1=a+apples[i];
             //  System.out.println(a1);
                if(a1>=s && a1<=t){
                   // System.out.println(s);
              //  System.out.println(t);
                ctr=ctr+1;}
            }
        }
           for(i=0;i<len2;i++){
                a2=0;
            if(oranges[i]<0) {
                a2=b+oranges[i];
                   //System.out.println(a2);
                if(a2>=s && a2<=t){
                       //System.out.println(s);
             //   System.out.println(t);
                ctr1=ctr1+1;}
            }
        }
        
        System.out.println(ctr);
        System.out.println(ctr1);
    
    


    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        String[] st = scanner.nextLine().split(" ");

        int s = Integer.parseInt(st[0]);

        int t = Integer.parseInt(st[1]);

        String[] ab = scanner.nextLine().split(" ");

        int a = Integer.parseInt(ab[0]);

        int b = Integer.parseInt(ab[1]);

        String[] mn = scanner.nextLine().split(" ");

        int m = Integer.parseInt(mn[0]);

        int n = Integer.parseInt(mn[1]);

        int[] apples = new int[m];

        String[] applesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < m; i++) {
            int applesItem = Integer.parseInt(applesItems[i]);
            apples[i] = applesItem;
        }

        int[] oranges = new int[n];

        String[] orangesItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int orangesItem = Integer.parseInt(orangesItems[i]);
            oranges[i] = orangesItem;
        }

        countApplesAndOranges(s, t, a, b, apples, oranges);

        scanner.close();
    }
}

