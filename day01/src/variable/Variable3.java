package variable;

public class Variable3 {
    public static void main(String[] args){
        int a = 10;
        String str1 = "abc";
        String str2 = new String("abc");
        String str3 = "abc";
        String str4 = new String("abc");
        // 주소를 비교하는 것이다.
        if(str1 == str3 ){
            System.out.println("OK");
        }
        // 내용을 비교하는 것.
        if (str1.equals(str3)){
            System.out.println("OK2");
        }
        str3 = "10";
        str1 = "ab";

        String result = str3 + 10; // + 연산은 가능하다 근데 int를 string으로 변환된다.
        int result2 = Integer.parseInt(str3) * 10; // 곱하기 연산을 하려면 Integer.parseInt를 해야한다.
        System.out.println(result2);

        int num = 100;
        String result3 = num +"";

    }
}
