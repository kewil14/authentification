package org.sid.secservice.sec.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@AllArgsConstructor
@NoArgsConstructor
@Data
@Table(name="USER")
public class AppUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="ID")
    private Long id;

    @Column(name="USERNAME")
    private String username;

    @Column(name="PWD")
    private String password;

    @ManyToMany(fetch = FetchType.LAZY)
    @Column(name="ROLES")
    private Collection<AppRole> appRoles;
}
