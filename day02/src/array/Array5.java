package array;

public class Array5 {
    public static void main(String[] args) {
        //2차원 배열
       int a[][] = new int[10][10];
       int b[][] = new int[10][];
       b[1] =new int[3];
       b[0] = new int[5];

       int c[][][] = new int[3][][];

        System.out.println(b.length);
        System.out.println(b[1].length);

        int a1[][] = new int[][]{{1,2},{3,4}};
        int a11 [][] = {{1,2},{3,4}};
        int a2[][] = new int[2][];

        a2[0] = new int[]{1,2};
        a2[1] = new int[]{2,3};

    }
}
