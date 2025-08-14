package demo.goatmanager.demo.entity;

import demo.goatmanager.demo.enum_.enum_goat;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Entity
@Data
@Table(name = "goats")
@Builder
@Getter@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class Goats {
    @Id
    @Column(name = "id_goat")
    private Long id_goat;
    @Column(name = "gender", nullable = false)
    private boolean gender;
    @Column(name = "birth_date", nullable = false)
    private LocalDate birthday;
    @Enumerated(EnumType.STRING)
    @Column(name = "status",nullable = false)
    private enum_goat status;
    @Column(name = "weight", nullable = false)
    private int weight;
    @Column(name = "qr_code_url")
    private String qr_code;
    @Column(name = "image_url")
    private String img_url;
    @Column(name = "description_goat",columnDefinition = "TEXT")
    private String description;
    @Column(name = "created_at", nullable = false)
    private LocalDateTime created_at;
    @Column(name = "updated_at", nullable = false)
    private LocalDateTime updated_at;
}
