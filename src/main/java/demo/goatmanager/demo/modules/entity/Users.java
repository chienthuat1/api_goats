package demo.goatmanager.demo.entity;

import demo.goatmanager.demo.enum_.enum_users;
import jakarta.persistence.*;
import lombok.*;

import java.time.LocalDateTime;
@Entity
@Data
@Table(name = "users")
@Builder
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Users {
    @Id
    @Column(name="id_user",nullable = false)
    private Long id_user;
    @Column(name = "username",nullable = false)
    private String username;
    @Column(name = "password_hash",nullable = false)
    private String password;
    @Column(name = "email",nullable = false)
    private String email;
    @Enumerated(EnumType.STRING)
    @Column(name = "role",nullable = false)
    private enum_users Role;
    @Column(name = "created_at",nullable = false)
    private LocalDateTime created;
   @Column(name = "updated_at",nullable = false)
    private LocalDateTime updated;

}
