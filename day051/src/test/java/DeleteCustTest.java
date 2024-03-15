import com.hana.data.CustDto;
import com.hana.exception.IdNotFountException;
import com.hana.frame.Service;
import com.hana.service.CustService;

public class DeleteCustTest {
    public static void main(String[] args) {
        Service<String, CustDto> service = new CustService();
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("james").build();
        try {
            service.del("id01");
        } catch (IdNotFountException e) {
            System.out.println(e.getMessage());
        }catch (Exception e ){
            System.out.println("Error입니다.");
        }
//        System.out.println(custDto);
    }
}