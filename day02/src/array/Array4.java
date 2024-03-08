package array;

import java.util.Arrays;
import java.util.Random;

public class Array4 {
    public static void main(String[] args) {
//        Random r = new Random();
//        int num = r.nextInt(10)+1;
//        System.out.println(num);
//        int ㅗㅕㅇ 배열 사이즈 10개
        // 배열에 1~10까지 숫자를 랜던함게 넣고
        // 단 중복되지 않는 숫자를 입력한다.
        /// 합과 평균을 구하시오
        Random r = new Random();
        int[] array_r = new int[10];
        int num = r.nextInt(100)+1;
        int i = 0;
        while (array_r[9] == 0) {
            if (Arrays.asList(array_r).contains(num))
                continue;
            array_r[i] = num;
            i++;
        }
        int sum = Arrays.stream(array_r).sum();
        int avg = sum/i;
        System.out.println(sum);
        System.out.println(avg);
    }
}
