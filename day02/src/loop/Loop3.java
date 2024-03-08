package loop;

import java.util.Scanner;

public class Loop3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        out:while (true){
            System.out.println("Input Command ... (q,c,r,u,d)");
            String cmd = sc.next();
            if(cmd.equals("q")){
                System.out.println("Bye");
                sc.close();
                break;
            }
            switch (cmd){
                case "c": System.out.println("Create"); break;
                case "r": System.out.println("Input Id....");
                    String id = sc.next();
                    System.out.println("Read ID Info,,,");
                    break;
//                    sc.close(); // 시스템의 리소스를 지켜줘야함.
//                    break out;
                case "u": System.out.println("Update"); break;
                case "d": System.out.println("Delete"); break;
                default: System.out.println("Tryagain"); break;
            }// 여기서 brack는 switch 문의 탈출이다 .다시 while 문으로 돌아가게 되어이씀
            // 문맥이 쓰래드다.
        }
        System.out.println("Endddddddddddd");
    }
}
