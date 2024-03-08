package loop;

public class Loop2 {
    public static void main(String[] args){
        int sum = 0;
        for (int i=0; i<=10; i++){
            sum += i;
        }
        System.out.println("if문"+sum);
        System.out.println("-----------------------------------");
        //while 문으로 변경
        int sum2 = 0;
        int x =1;
        while (x<=10){
            sum2 += x;
            x++;
        }
        System.out.println("while문  "+sum2/x);
    }
}
