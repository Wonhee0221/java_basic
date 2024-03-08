package array;

import java.util.Arrays;
import java.util.Random;

public class Array7 {
    public static void main(String[] args) {
        // 5행 5열의 배열에
        // Random하게 중복되지 않은 1~100까지의 숫를 발생시킨다.
        // 각 ㅕㅇㄹ에 최대값의 합과 최소값의 합을 출력하시오
        int[][] array_r = new int[5][5];
        int max_arr = 0;
        int min_arr = 99999999;
        int final_max = 0;
        int final_min= 0;

        Random rn = new Random();
        for (int i=0; i<array_r.length; i++){
            for(int j=0; j<array_r[i].length;j++){
                int t = rn.nextInt(100)+1;
                while (true){
                    if (Arrays.asList(array_r).contains(t)){
                        continue;
                    }
                    else {
                        break;
                    }
                }
                array_r[i][j] = t;
                if (t>=max_arr){
                    max_arr = t;
                } else if (t<=min_arr) {
                    min_arr = t;
                }
            }
            final_max += max_arr;
            final_min += min_arr;
            min_arr = 0;
            max_arr = 0;
        }
        System.out.printf("%d,%d",final_max,final_min);
    }
}
