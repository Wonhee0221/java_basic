import com.hana.data.CustDto;
import com.hana.exception.IdNotFountException;
import com.hana.frame.Service;
import com.hana.service.CustService;

public class UpdateCustTest {
    public static void main(String[] args) {
        Service<String, CustDto> service = new CustService();
        CustDto custDto = CustDto.builder().id("id01").pwd("pwd01").name("james").build();
        try {
            service.modify(custDto);
        } catch (IdNotFountException e) {
            System.out.println(e.getMessage());
        }catch (Exception e ){
            System.out.println("Error입니다.");
        }
//        System.out.println(custDto);
    }
}