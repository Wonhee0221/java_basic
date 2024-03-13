import org.example.app.data.CustDto;
import org.example.app.data.ItemDto;
import org.example.app.frame.Service;
import org.example.app.service.CustService;
import org.example.app.service.ItemService;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Service<String, CustDto> service;
        service = new CustService();

        //디버깅하기
        // inssert
        CustDto custDto = new CustDto().builder().id("id01").pwd("pwd01").name("james").build();
        service.add(custDto);

//        List<CustDto> list = null;
//        list = service.get();
//        for(CustDto cust: list){
//            System.out.println(cust);
//        }

        Service<Long, ItemDto> service2;
        service2 = new ItemService();
        ItemDto itemDto = new ItemDto().builder().id(6L).name("고래밥").price(1000L).build();
        service2.add(itemDto);
        List<ItemDto> list1 = null;
        list1 = service2.get();
        for(ItemDto item:list1){
            System.out.println(item);
        }
    }
}
