package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class ItemDao implements Dao<Long, ItemDto> {
    @Override
    public int insert(ItemDto itemDto) {
        System.out.println("DB: inserted...."+itemDto);
        return 0;
    }

    @Override
    public int delete(Long s) {
        System.out.println("DB: delete...."+s);
        return 0;
    }

    @Override
    public int update(ItemDto itemDto) {
        System.out.println("DB: Update...." + itemDto);
        return 0;
    }

    @Override
    public ItemDto select(Long s) {
        return ItemDto.builder().id(s).name("홈런볼").price(10000L).build();
    }

    @Override
    public List<ItemDto> select() {
        List list = new ArrayList<>();
        list.add(ItemDto.builder().id(5L).name("홈런볼").price(10000L).build());
        list.add(ItemDto.builder().id(6L).name("맛동산").price(20000L).build());
        list.add(ItemDto.builder().id(7L).name("새우깡").price(30000L).build());
        return list;
    }
}
