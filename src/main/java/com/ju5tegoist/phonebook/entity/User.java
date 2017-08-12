package com.ju5tegoist.phonebook.entity;

import lombok.Data;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

import javax.persistence.*;
import java.util.Set;

/**
 * Created by yulia on 14.07.17.
 */
@Entity
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
@Data
@Table(name = "user")
public class User {
    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;
    @Column(name = "full_name")
    private String fullName;
    @Column(name = "login")
    private String login;
    @Column(name = "password")
    private String password;
//    @OneToMany(fetch = FetchType.LAZY, mappedBy = "user")
//    private Set<Contact> contacts;
}
