package day0311;

import java.util.Scanner;

public class test4 {
    public static String list369(int num){
        String num_str = Integer.toString(num);
        String result = "";
        if (num_str.contains("3") || num_str.contains("6") || num_str.contains("9")){
            for(int j=0;j<num_str.length();j++){
                if(num_str.charAt(j) == '3' || num_str.charAt(j) == '6' || num_str.charAt(j) == '9'){
                    result += "X";
                }
            }
        }else{
            result = Integer.toString(num);
        }
        return result;
    }

    public static void main(String[] args) {
        Scanner r = new Scanner(System.in);
        for (int i=1 ;i<=20;i++){
            if (i%2!=0){
                System.out.print("컴퓨터 : "+ list369(i));
            }else {
                String userInput = r.next();
                if (!userInput.equals(list369(i))){
                    System.out.print("컴퓨터승");
                    break;
                }
            }
            if (i==20){
                System.out.println("무승부");
            }
        }
        System.out.println("게임종료");
    }
}
