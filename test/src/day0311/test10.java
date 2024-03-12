package day0311;

import java.util.Scanner;
public class test10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String[] results = sc.nextLine().split("");
        int openCount = 0;
        int closeCount = 0;
        for(int i=0; i<results.length;i++){
            if (results[i].equals("(")){
                openCount++;
            }else{
                closeCount ++;
            }
        }
        System.out.printf("%d,%d",openCount,closeCount);
    }

}
