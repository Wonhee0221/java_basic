package company;

public class SecretaryEmployee extends Employee{
    // 생성자를 제외한 모든것이 상속된다.
    private String boss;

    public SecretaryEmployee() {
    }

    public SecretaryEmployee(String id, String name, String dept, long salary, String boss) {
        super(id, name, dept, salary);
        this.boss = boss;
    }

    public String getBoss() {
        return boss;
    }

    @Override
    public String toString() {
        return super.toString() + this.boss;
    }
}
