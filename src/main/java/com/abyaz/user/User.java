package com.abyaz.user;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
@Table(name = "_user")
public class User {
    @Id
    @GeneratedValue
    private Integer id;
    private String firstName;
    private String secondName;
    private String email;
    private String password;
}
