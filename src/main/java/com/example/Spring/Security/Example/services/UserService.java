package com.example.Spring.Security.Example.services;

import com.example.Spring.Security.Example.beans.StoreItem;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
@RequiredArgsConstructor
public class UserService {

    private final ItemService itemService;
    private final List<StoreItem> userItems = new ArrayList<>();

    public List<StoreItem> getPurchasedItems() {
        return userItems;
    }

    public List<StoreItem> purchaseItem() {
        StoreItem storeItem=itemService.storeItems.get(0);
        userItems.add(storeItem);
        return userItems;
    }
}
