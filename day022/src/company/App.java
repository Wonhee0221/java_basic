package company;

public class App {
    public static void main(String[] args) {
        Empolyee emp = new Empolyee(100, "id01","홍길동",200000);
//        emp.sal = 200000;
        long sal =emp.getSal();
        long annsal = emp.getAnnSalary();
        System.out.println(emp);

    }
}
