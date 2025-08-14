package demo.goatmanager.demo.entity;

import jakarta.persistence.*;
import lombok.*;


@Entity
@Data
@Table(name = "vaccines")
@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Vaccine {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_vaccine",nullable = false)
    private int id_vaccine;
    @Column(name="vaccine_name", nullable=false)
    private String vaccine_name;
    @Column(name="vaccine_manufacturer", nullable=false)
    private String vaccine_manufacturer;
    @Column(name="description",nullable=true)
    private String vaccine_description;
}
