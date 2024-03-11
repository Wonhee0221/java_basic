package day0311;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class test2 {
    public static void main(String[] args) {
        // 로또 번호 6개를 발생시키고 저장할 Set 생성
        Set<Integer> lottoNumbers = generateLottoNumbers();

        // 발생시킨 로또 번호 출력
        System.out.println("로또 당첨 번호: " + lottoNumbers);
    }

    private static Set<Integer> generateLottoNumbers() {
        Set<Integer> lottoNumbers = new HashSet<>();
        Random random = new Random();

        // 6개의 로또 번호를 발생시키기
        while (lottoNumbers.size() < 6) {
            int randomNumber = random.nextInt(45) + 1; // 1부터 45까지의 난수 발생
            lottoNumbers.add(randomNumber);
        }

        return lottoNumbers;
    }
}
//2번 문제 - 로또 번호 발생기
//    홍길동은 매주 로또를 한장씩 산다.
//    이번 주는 프로그램으로 로또 당첨 번호를 발생시켜, 수동으로 로또 번호를 기입하려고 한다.
//    프로그램으로 로또번호 6개를 발생시키고, 출력해보자.
//    단 로또 번호는 1~45까지의 정수이고, 6개이다.
//    중복된 번호가 발생하면, 재추첨해서 중복 수를 피해야 한다.
//            Math.random() 함수나 Random 클래스의 nextInt() 함수를 사용하여 랜덤한 수를 발생시킨다.
//    입력 예)
//    없음
//    출력 예)
//            12 17 23 43 9 33
//    출력 예)
//            15 15(중복발생! 재추첨) 37 29 42 22 8



