package day0311;

import java.util.Random;
import java.util.Scanner;

public class test9 {
    public static void main(String[] args){
        Random r = new Random();
        Scanner s = new Scanner(System.in);
        boolean result = false;
        int computer = r.nextInt(100)+1;
        while(!result){
            System.out.println("번호를 입력하세요");
            int human = s.nextInt();
            if (computer==human){
                System.out.println("정답입니다.");
                result =true;
            } else if (computer > human) {
                System.out.println("번호가 정답보다 작습니다");
            }else {
                System.out.println("번호가 정답보다 큽니다");
            }
        }
        s.close();
    }
}
