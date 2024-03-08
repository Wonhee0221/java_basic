package array;

public class Customer {
    private String id;
    private String pwd;
    private String name;

    public Customer(String id) {
        this.id = id;
        this.pwd = id;
        this.name = id;
    }

    public String getId() {
            return id;
    }

    public void setId(String id) {
            this.id = id;
    }

        @Override
        public String toString() {
            final StringBuilder sb = new StringBuilder("Customer{");
            sb.append("id='").append(id).append('\'');
            sb.append(", pwd='").append(pwd).append('\'');
            sb.append(", name='").append(name).append('\'');
            sb.append('}');
            return sb.toString();
        }
    }

