import com.hana.frame.ConnectionPool;

import java.sql.SQLException;

public class ConnectionPoolTest {
    public static <Connection> void main(String[] args) {
        ConnectionPool cp= null;
        try {
            cp = ConnectionPool.create();
            System.out.println(cp.getSize());
            //한번 더 실행한 다고  static 영역에서 두번 호출되지않음.
            cp = ConnectionPool.create();
            System.out.println(cp.getSize());
//            cp.releaseConnection();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        System.out.println("Hello world!");
    }
}