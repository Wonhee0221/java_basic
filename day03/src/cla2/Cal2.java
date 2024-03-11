package cla2;

import cla1.Cal;

// 기능중심의 클래스를 만들려고함. 객체의 상태가 있는건 아니다.
// 객체ㅔ의 클래스안에 함수가 있다는건? new에 의해서 객체를 생성
public class Cal2 {
    static Double PI = 3.14;
    public static double sum(int num1, int num2){
        return num1 + num2;
    }
    public static double div(int num1, int num2){
        return num1*1.0/ num2;
    }
    // 반지름을 집어넣으면 원의 넓이를 구해주는 함수
    public static double getCircleArea(int r){
        return r*r*PI;
    }
}
