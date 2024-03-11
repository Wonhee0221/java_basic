package company;

public class Empolyee {
    private int id;
    private String idc;
    private String name;
    private long sal;

    private static int num = 100;

    // 생성자(constructor)

    public Empolyee() {
        System.out.println("Default Constructor...");
    }

    public Empolyee(int id) {
        this(id,"","");
        this.sal = 10000L;
    }

//    public Empolyee(int x) {
//        this(id,"","",10000L);
//    }

    public Empolyee(int id, String idc, String name, long sal) {
        this.id = num++;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
    }

    public Empolyee(int id, String idc, String name) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = 100000L; // 매개변수로long sal 이 없는 이유는 기본값으로 설정해뒀기 때문이다.
    }

    public int getId() {
        return id;
    }

    public String getIdc() {
        return idc;
    }

    public String getName() {
        return name;
    }

    public long getSal() {
        return sal;
    }
    //함수하나 만들기. Method, Operator
    public long getAnnSalary(){
        return sal;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Empolyee{");
        sb.append("id=").append(id);
        sb.append(", idc='").append(idc).append('\'');
        sb.append(", name='").append(name).append('\'');
        sb.append(", sal=").append(sal);
        sb.append('}');
        return sb.toString();
    }
}
