package com.didem.hackerrank;

import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class Solution {

    // Complete the kangaroo function below.
    static String kangaroo(int x1, int v1, int x2, int v2) {
        boolean test=false;
        String answer = null;
        while(x1 <= x2){
            if(x1 == x2){
                test=true;
            }
            x1 += v1;
            x2 += v2;
        }
        answer = test == true ?  "YES" :  "NO";
        return answer;
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) throws IOException {
        //BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

       // String[] x1V1X2V2 = scanner.nextLine().split(" ");

        int x1 = 4523;

        int v1 = 8092;

        int x2 = 9419;

        int v2 = 8076;

        String result = kangaroo(x1, v1, x2, v2);


        scanner.close();
    }
}

