package com.example.Spring.Security.Example.beans;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class StoreItem {

    private String id;
    private String name;
    private double price;

}
