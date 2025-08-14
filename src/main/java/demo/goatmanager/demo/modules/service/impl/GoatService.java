package demo.goatmanager.demo.service.impl;

import demo.goatmanager.demo.modules.entity.Goats;
import demo.goatmanager.demo.repository.GoatRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class GoatService {
    @Autowired
    GoatRepository goat_repository;

    public List<Goats> getAllGoats() {
        return goat_repository.findAll();
    }
    public List<Goats> goatsList() {return goat_repository.findAllLive();}
}
