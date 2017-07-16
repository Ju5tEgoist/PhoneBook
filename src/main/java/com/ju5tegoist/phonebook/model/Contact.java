package com.ju5tegoist.phonebook.model;

import lombok.Data;

import javax.persistence.*;

/**
 * Created by yulia on 16.07.17.
 */
@Entity
@Data
@Table(name = "contact")
public class Contact {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "user_id", nullable = false)
    private User user;
    private String firstName;
    private String lastName;
    private String nameAfterLast;
    private String mobilePhone;
    private String homePhone;
    private String address;
    private String email;
}
