package variable;

public class Variable5 {
    public static void main(String[] args){
        String str = "abcdefg";

        // 역순으로 대문자출력
        char [] result = str.toUpperCase().toCharArray();
        for(int i = result.length -1; i>= 0; i--) {
            System.out.println(result[i]);
        }
        
    }
}
