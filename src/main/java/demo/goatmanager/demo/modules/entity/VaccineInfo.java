package demo.goatmanager.demo.entity;

import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Table(name = "vaccination_history")
@Data
@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class VaccineInfo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_history")
    private long id_history;
    @Column(name = "goat_id",nullable = false)
    private Long goat_id;
    @Column(name = "vaccine_id",nullable = false)
    private Long vaccine_id;
    @Column(name = "date_vaccine",nullable = false)
    private LocalDate date_vaccine;
    @Column(name = "note",nullable = true)
    private String note;
    @Column(name = "created_at",nullable = false)
    private LocalDateTime created_at;

}
