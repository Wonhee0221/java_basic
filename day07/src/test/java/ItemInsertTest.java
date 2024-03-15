import com.hana.data.ItemDto;
import com.hana.service.ItemService;
import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public class ItemInsertTest {
    public static void main(String[] args) {
        ItemService service = new ItemService();
        ItemDto obj = ItemDto.builder().name("맛동산").price(1000L).build();
        try {
            service.add(obj);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        System.out.println("Hello world!");
    }
}