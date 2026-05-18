package org.pantheon.paotheon.entity;

import org.pantheon.paotheon.receitas.Receita;
import java.time.Instant;
import java.util.HashSet;
import java.util.Set;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.FetchType;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;
import net.minidev.json.annotate.JsonIgnore;

@Entity
@Table(name = "users")
public class User{
   
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    @Column(nullable = false, unique = true)
    private String email;
    
    @Column(nullable = false)
    private String password;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private boolean active = true;
    
    @Column(nullable = false)
    private boolean emailVerified = false;
    
    @Column(unique = true)
    private String verificationToken;

    @Column
    private Instant verificationTokenExpiry;

    @Column
    private String passwordRestToken;

    @Column
    private Instant passwordRestTokenExpiry;

    @CreationTimestamp
    @Column(nullable = false, updatable = false)
    private Instant createdAt;

    @UpdateTimestamp
    @Column(nullable = false)
    private Instant updatedAt;
    
    @JsonIgnore
    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
        new = "user_todolist(name = "user_id"),
        inverseJoinColumns = @JoinColumn(name = "receita_id")
    )
    private Set<Receita> todolist = new HashSet<>();

    public void addToDoList(Receita receita){
        this.todolist.add(receita);
    }

    public void removeToDoList(Receita receita){
        this.todolist.remove(receita);
    }
}
