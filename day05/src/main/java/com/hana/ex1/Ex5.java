package com.hana.ex1;

import java.io.IOException;
import java.io.InputStreamReader;

public class Ex5 {
    public static void main(String[] args) {
        InputStreamReader is = null; // 파일시스템에 있는 것들을 가져오는 역할을 한다.
        is = new InputStreamReader(System.in);
        try {
            System.out.println(is.read());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }finally{
            if(is !=null){
                try {
                    is.close();
                } catch (IOException e) {
                    try {
                        Thread.sleep(2000);
                        is.close();
                    } catch (Exception ex) {
                        throw new RuntimeException(ex);
                    }
                }
            }

        }

    }
}
