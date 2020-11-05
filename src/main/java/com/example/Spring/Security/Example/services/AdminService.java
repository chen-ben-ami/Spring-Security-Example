package com.example.Spring.Security.Example.services;

import com.example.Spring.Security.Example.beans.StoreItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class AdminService {

    private final ItemService itemService;
    public List<StoreItem> removeItem(String id) {
        itemService.storeItems.removeIf(item->item.getId().equals(id));
        return itemService.storeItems;
    }

    public List<StoreItem> addItem(StoreItem storeItem) {
        itemService.storeItems.add(storeItem);
        return itemService.storeItems;
    }
}
