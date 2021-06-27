package com.example.store.dto;

import com.example.store.model.StoreType;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

public class StoreDTO {
    @NotBlank(message = "Name is mandatory!")
    @Size(min = 3, max = 255, message = "Name must be between 3 and 255 symbols")
    private String name;

    private StoreType type;

    public StoreDTO(String name, StoreType type) {
        this.name = name;
        this.type = type;
    }

    public StoreDTO() {
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public StoreType getType() {
        return type;
    }

    public void setType(StoreType type) {
        this.type = type;
    }
}
