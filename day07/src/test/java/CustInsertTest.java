import com.hana.data.CustDto;
import com.hana.service.CustService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class CustInsertTest {
    public static void main(String[] args) {
        CustService service = new CustService();
        CustDto obj = CustDto.builder().id("id04").pwd("pwd04").name("james1").build();
        try {
            service.add(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello world!");
    }
}