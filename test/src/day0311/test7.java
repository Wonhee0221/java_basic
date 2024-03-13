package day0311;

import java.util.Scanner;

public class test7 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        while (num>50){
            System.out.println("입력값은 50을 초과할 수 없습니다.");
            num = sc.nextInt();
        }

        int prev = 0;
        int sum = 0;
        for (int i=1; i<=num; i++){
            prev = prev+i;
            sum += prev;
        }
        System.out.println(sum);
sc.close();
}

}
