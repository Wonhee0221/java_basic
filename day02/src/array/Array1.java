package array;

public class Array1 {
    public static void main(String[] args){
        int a []; // int 자료형만 저장가능하다.
        a = new int[5]; // 5개가 들어갈 수있다. 숫자 5이 들어가는게 아니다.
        a[0] = 1;
        a[1] = 2;
        a[3] = 10;

        System.out.println(a[1]);


        int [] b;
        b = new int[]{1,2,3,4,5}; // 얘는 5개만 가능

        int [] c = {1,2,3,4,5};
        String [] d ={"A","B"};

    }
}
