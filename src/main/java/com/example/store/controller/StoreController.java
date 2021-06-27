package com.example.store.controller;

import com.example.store.dto.StoreDTO;
import com.example.store.model.Store;
import com.example.store.repository.StoreRepository;
import com.example.store.service.StoreService;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
public class StoreController {
    private StoreService storeService;

    public StoreController(StoreService storeService) {
        this.storeService = storeService;
    }

    @GetMapping("/api/v1/stores")
    List<Store> getStores() {
        return storeService.getStores();
    }

    @GetMapping("/api/v1/stores/{storeId}")
    Store getStore(@PathVariable Long storeId) {
        return storeService.getStoreById(storeId);
    }

    @PostMapping("/api/v1/stores")
    Store createStore(@Valid @RequestBody StoreDTO newStore) {
        Store storeToCreate = new Store(newStore.getName(), newStore.getType());
        return storeService.createStore(storeToCreate);
    }
}
