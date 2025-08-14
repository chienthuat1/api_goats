package demo.goatmanager.demo.repository;

import demo.goatmanager.demo.modules.entity.Goats;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface GoatRepository extends JpaRepository<Goats,Long> {
    @Query(
            value = "SELECT g.* FROM goats g JOIN vaccination_history vh ON g.id_goat = vh.goat_id JOIN vaccines v ON v.id_vaccine = vh.vaccine_id WHERE g.status = 'Live'",
            nativeQuery = true
    ) public List<Goats> findAllLive();
}
