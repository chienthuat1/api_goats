package demo.goatmanager.demo.service.impl;

import demo.goatmanager.demo.modules.entity.VaccineInfo;
import demo.goatmanager.demo.repository.VaccineInfoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VaccineInfoService {
    @Autowired
    VaccineInfoRepository vaccineInfo_Repository;

    public List<VaccineInfo> GetAllVaccineInfo(){
        return vaccineInfo_Repository.findAll();
    }
}
