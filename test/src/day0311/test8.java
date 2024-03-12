package day0311;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class test8 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String inputLine = scanner.nextLine();
        String[] inputArray = inputLine.split(" ");

        // 1번째와 2번째 값을 따로 저장
        int value1 = Integer.parseInt(inputArray[0]);
        int value2 = Integer.parseInt(inputArray[1]);

        // 3번째부터는 숫자 배열로 저장
        int[] numericArray = new int[inputArray.length - 2];
        for (int i = 2; i < inputArray.length; i++) {
            numericArray[i - 2] = Integer.parseInt(inputArray[i]);
        }
        Arrays.sort(numericArray);
        for(int i=0;i<value1;i++){
            if (i%value2==0){
                System.out.println();
            }
            System.out.print(numericArray[i]+" ");

        }


    }
}
