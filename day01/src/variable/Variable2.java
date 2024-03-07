package variable;

public class Variable2 {
    public static void main(String[] args){
        // 정수의 기본 = int
        int a = 10;
        byte a1 = 100; //127까지 가능
        byte a2 = 100;
        // 연산은 무적권 int로 하기때문에 바이트로 들어와도 결과는 int로 나온다,
        byte a3 = (byte) (a1+a2);
        System.out.println(a3);

        //int a4 = 2150000000; // 32비트라 21억4천만 까지 만된다.
        long a5 = 2150000000L; // ㄷ뒤에 L을 붙혀야 64비트로 인식한다.
        long a6 =1150000000 + 2150000000L;
        System.out.println(a6);

        char ch = '존';
        System.out.println((int) ch);

        char ch2 = '\u0042'; //unicode B
        System.out.println( ch2);

        char ch3 = 0xac00; //16진수 unicode 44032 가
        System.out.println( ch3 );
        
        //실수의 기본
        double d = 10.0;
        float f = 10.0f; // 안됨. 왜? 32bit로 표현 그래서 f나 F를 붙혀준다.
        
        
        //Boolean
        boolean b =true;
    }
}
