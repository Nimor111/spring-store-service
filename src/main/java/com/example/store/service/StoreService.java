package com.example.store.service;

import com.example.store.model.Store;
import org.springframework.stereotype.Service;

import java.util.List;

public interface StoreService {
    List<Store> getStores();
    Store getStoreById(Long id);
    Store createStore(Store store);
}
