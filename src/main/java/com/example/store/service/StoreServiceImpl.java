package com.example.store.service;

import com.example.store.dto.StoreDTO;
import com.example.store.exception.StoreNotFoundException;
import com.example.store.model.Store;
import com.example.store.repository.StoreRepository;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;
import java.util.List;

@Service
public class StoreServiceImpl implements StoreService {
    private StoreRepository repository;

    public StoreServiceImpl(StoreRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Store> getStores() {
        return repository.findAll();
    }

    @Override
    public Store getStoreById(Long id) {
        return repository
                .findById(id)
                .orElseThrow(() -> new StoreNotFoundException(id));
    }

    @Override
    public Store createStore(Store newStore) {
        return repository.save(newStore);
    }
}
