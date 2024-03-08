package company;

public class Empolyee {
    private int id;
    private String idc;
    private String name;
    private long sal;

    public Empolyee(int id, String idc, String name, long sal) {
        this.id = id;
        this.idc = idc;
        this.name = name;
        this.sal = sal;
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
