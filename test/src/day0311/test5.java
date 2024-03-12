package day0311;

import java.util.Random;

public class test5 {
    public static void main(String[] args) {
        Random boll = new Random();
        int outCount = 0;
        int player = 1;
        while (outCount<3){
            int bollCount = 0;
            int strickCount = 0;
            System.out.print(player+"번타자");
            System.out.println();

            while (true){
                int x = boll.nextInt(2);
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                if (x==0){
                    System.out.println("볼~");
                    bollCount++;
                }else{
                    System.out.println("스트라이크!");
                    strickCount++;
                }
                if(bollCount==4){
                    System.out.println("1루진출");
                    player++;
                    break;
                }else if (strickCount==3){
                    System.out.println("삼진아웃");
                    player++;
                    outCount++;
                    break;
                }
            }
        }
        System.out.println("게임종료!");

    }
}
