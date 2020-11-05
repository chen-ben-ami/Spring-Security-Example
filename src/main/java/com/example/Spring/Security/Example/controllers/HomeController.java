package com.example.Spring.Security.Example.controllers;

import com.example.Spring.Security.Example.beans.StoreItem;
import com.example.Spring.Security.Example.services.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequiredArgsConstructor
public class HomeController {

    private final ItemService itemService;


    @GetMapping("/")
    public List<StoreItem> homePage() {
        return itemService.getItems();
    }
}
