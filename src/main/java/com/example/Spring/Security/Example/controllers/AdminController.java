package com.example.Spring.Security.Example.controllers;

import com.example.Spring.Security.Example.beans.StoreItem;
import com.example.Spring.Security.Example.services.AdminService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
@RequiredArgsConstructor
public class AdminController {

    private final AdminService adminService;

    @RequestMapping("/addItemToStore")
    public List<StoreItem> addItemToStore() {
        return adminService.addItem(new StoreItem("5","Calculator",10));
    }

    @RequestMapping("/removeItemFromStore")
    public List<StoreItem> removeItemFromStore() {
        return adminService.removeItem("2");

    }


}
