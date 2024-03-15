import com.hana.data.CustDto;
import com.hana.exception.NotFountException;
import com.hana.frame.Service;
import com.hana.service.CustService;

public class GetCustTest {
    public static void main(String[] args) {
        Service<String, CustDto> service = new CustService();
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("james").build();
        try {
            service.get("id01");
        } catch (NotFountException e) {
            System.out.println(e.getMessage());
        }catch (Exception e ){
            System.out.println("Error입니다.");
        }
//        System.out.println(custDto);
    }
}