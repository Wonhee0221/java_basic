package day0311;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class test11 {
    public static void main(String[] args) {
         class Student {
            private String name;
            private int kor;
            private int eng;
            private int mat;

            public Student(String name, int kor, int eng, int mat) {
                this.name = name;
                this.kor = kor;
                this.eng = eng;
                this.mat = mat;
            }

            public String getName() {
                return name;
            }

            public void setName(String name) {
                this.name = name;
            }

            public int getKor() {
                return kor;
            }

            public void setKor(int kor) {
                this.kor = kor;
            }

            public int getEng() {
                return eng;
            }

            public void setEng(int eng) {
                this.eng = eng;
            }

            public int getMat() {
                return mat;
            }

            public void setMat(int mat) {
                this.mat = mat;
            }

            public int getTotal() {
                return kor + eng + mat;
            }

            public double getAverage() {
                return getTotal() / 3.0;
            }

            @Override
            public String toString() {
                return "학생 이름: " + name + ", 국어: " + kor + ", 영어: " + eng + ", 수학: " + mat +
                        ", 총점: " + getTotal() + ", 평균: " + getAverage();
            }
        }
        Scanner sc = new Scanner(System.in);
        List<Student> studentInfoList = new ArrayList<>();
        boolean out = true;
        while (out){
            System.out.println("---------성적관리프로그램--------");
            System.out.println("1.입력 2.전체출력 3.검색 4.수정 5.삭제 6.종료");
            int choice = sc.nextInt();
            switch (choice){
                case 1:
                    System.out.printf("이름입력:");
                    String name = sc.next();
                    System.out.printf("국어점수입력:");
                    int kor = sc.nextInt();
                    System.out.printf("영어점수입력:");
                    int eng = sc.nextInt();
                    System.out.printf("수학점수입력:");
                    int mat = sc.nextInt();


                    Student student = new Student(name, kor, eng, mat);
                    studentInfoList.add(student);
                    break;
                case 2:
                    for (Student students : studentInfoList) {
                        System.out.println(students);
                    }
                    break;
                case 3:
                    System.out.print("검색할 사람이름 : ");
                    String findName = sc.next();
                    for(Student students : studentInfoList) {
                        if(students.getName().equals(findName)){
                            System.out.println(students); // 공백 라인 추가
                        }
                    }
                    break;
                case 4:
                    System.out.print("수정할 사람이름 : ");
                    String updateName = sc.next();
                    System.out.print("수정할 내용은? 1.국어 2.영어 3.수학 ");
                    int updateCode = sc.nextInt();
                    for (Student students : studentInfoList) {
                        if (students.getName().equals(updateName)) {
                            switch (updateCode){
                                case 1:
                                    System.out.printf("새로운 국어 점수를 입력하세요:");
                                    int newKor = sc.nextInt();
                                    students.setKor(newKor);
                                    break;
                                case 2:
                                    System.out.printf("새로운 영어 점수를 입력하세요:");
                                    int newEng = sc.nextInt();
                                    students.setEng(newEng);
                                    break;
                                case 3:
                                    System.out.printf("새로운 수학 점수를 입력하세요:");
                                    int newMat = sc.nextInt();
                                    students.setMat(newMat);
                                    break;
                            }
                        }
                    }
                    break;
                case 5:
                    System.out.print("삭제할 사람 이름 : ");
                    String deleteName = sc.next();
                    for (Student student_D : studentInfoList) {
                        if (student_D.getName().equals(deleteName)) {
                            studentInfoList.remove(student_D);
                        }
                    }
                    break;
                case 6:
                    sc.close();
                    out=false;
                    System.out.println("종료!!");
                    break;

            }
        }
    }
}
