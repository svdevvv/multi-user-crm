package com.svdev.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.EnumType;
import jakarta.persistence.Enumerated;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import org.hibernate.envers.Audited;
import org.hibernate.envers.NotAudited;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@EqualsAndHashCode(of = "email", callSuper = false)
@Table(name = "\"user\"")
@Audited
public class User extends BaseEntity {
     
    private String name;
    private String email;
    private String password;

    @Enumerated(EnumType.STRING)
    private Role role;

    @Column(name = "created_at")
    private LocalDateTime createdAt;

    @NotAudited
    @Builder.Default
    @OneToMany(mappedBy = "user")
    private List<Client> clients = new ArrayList<>();

}
