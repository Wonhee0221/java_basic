package app;

import company.Empolyee;

public class App {
    public static void main(String[] args) {
        Empolyee emp = new Empolyee(0,"10001","intern1", 20000L);
        Empolyee emp1 = new Empolyee(1,"10002","intern2",20000L);
        Empolyee emp2 = new Empolyee(2,"10003","intern3",20000L);

        System.out.println(emp);
        System.out.println(emp1);
        System.out.println(emp2);

    }
}
