package com.example.Spring.Security.Example.controllers;

import com.example.Spring.Security.Example.beans.StoreItem;
import com.example.Spring.Security.Example.services.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.security.Principal;
import java.util.List;

import static java.lang.Double.sum;

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

    @RequestMapping("/pay")
    public double pay(Principal principal) throws Exception {
        //Checks if the the current logged in user is with username -user
        //In a real app you will check by username and token
        if (principal.getName().equals("user")) {
            return userService.userItems.stream()
                    .mapToDouble(StoreItem::getPrice).sum();
        } else {
           throw new Exception("Please log in as a user");
        }

    }
}
