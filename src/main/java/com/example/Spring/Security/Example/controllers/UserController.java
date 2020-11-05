package com.example.Spring.Security.Example.controllers;

import com.example.Spring.Security.Example.beans.StoreItem;
import com.example.Spring.Security.Example.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/user")
@RequiredArgsConstructor
public class UserController {

    private final UserService userService;

    @RequestMapping("/getPurchased")
    public List<StoreItem> getPurchasedItems() {
        return userService.getPurchasedItems();
    }

    @RequestMapping("/purchaseItem")
    public List<StoreItem> purchaseItem() {
        return userService.purchaseItem();
    }
}
