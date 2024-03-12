package day0311;

import java.util.Scanner;

public class test6 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int inputNum = sc.nextInt();
        while (inputNum < 3 || inputNum >99 || inputNum%2==0){
            System.out.println("입력할수 없습니다 다시입력하세요");
            inputNum = sc.nextInt();
        }
        for(int i=1; i < inputNum+1; i+=2){
            for (int j = inputNum-1; j > i; j-=2){
                System.out.print(" ");
            }
            for (int j=0; j < i; j++){
                System.out.print("*");
            }
            System.out.println();
        }

    }
    }
