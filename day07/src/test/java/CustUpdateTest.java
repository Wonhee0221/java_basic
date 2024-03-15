import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustUpdateTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id04").pwd("pwd04").name("james1").build();
        try {
            service.modify(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello world!");
    }
}