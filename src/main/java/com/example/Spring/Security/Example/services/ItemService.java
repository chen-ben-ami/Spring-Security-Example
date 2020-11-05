package com.example.Spring.Security.Example.services;

import com.example.Spring.Security.Example.beans.StoreItem;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;

@Service
public class ItemService {

    public List<StoreItem> storeItems = new ArrayList<>();

    @PostConstruct
    public void setup() {
        storeItems.add(new StoreItem("1", "Pencil", 1.5));
        storeItems.add(new StoreItem("2", "Notebook", 5));
        storeItems.add(new StoreItem("3", "Pen", 2));
        storeItems.add(new StoreItem("4", "Eraser", 3));
    }

    public List<StoreItem> getItems() {
        return storeItems;
    }


}
