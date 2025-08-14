package demo.goatmanager.demo.service.impl;

import demo.goatmanager.demo.modules.entity.Vaccine;
import demo.goatmanager.demo.repository.VaccineRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineService {
    @Autowired
    VaccineRepository vaccine_Repository;

    public List<Vaccine> getAllVaccines() {
        return vaccine_Repository.findAll();
    }
}
