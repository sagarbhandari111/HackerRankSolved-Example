import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the breakingRecords function below.
    static int[] breakingRecords(int[] scores) {
        int i,maxCtr=0,minCtr=0,len=scores.length,min,max;
        int[] res=new int[2];
         min=scores[0];
                max=scores[0];
       for(i=1;i<len;i++){
            if(min>scores[i]&&max>scores[i]){
                  min=scores[i];
               // min=scores[i];
                
              minCtr=minCtr+1;}
                if(max<scores[i]&&min<scores[i]){
                max=scores[i];
                maxCtr=maxCtr+1;}
                
            
               
            }if(max!=0){
                res[0]=maxCtr;}
           if(min!=0){
       res[1]=minCtr;}
        return res;
        }


    

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        int[] scores = new int[n];

        String[] scoresItems = scanner.nextLine().split(" ");
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        for (int i = 0; i < n; i++) {
            int scoresItem = Integer.parseInt(scoresItems[i]);
            scores[i] = scoresItem;
        }

        int[] result = breakingRecords(scores);

        for (int i = 0; i < result.length; i++) {
            bufferedWriter.write(String.valueOf(result[i]));

            if (i != result.length - 1) {
                bufferedWriter.write(" ");
            }
        }

        bufferedWriter.newLine();

        bufferedWriter.close();

        scanner.close();
    }
}

