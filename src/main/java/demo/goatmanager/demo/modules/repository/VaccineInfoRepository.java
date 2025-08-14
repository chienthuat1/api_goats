package demo.goatmanager.demo.repository;

import demo.goatmanager.demo.modules.entity.VaccineInfo;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface VaccineInfoRepository extends JpaRepository<VaccineInfo, Integer> {
}
