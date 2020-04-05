package com.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;
import java.time.ZonedDateTime;

@Entity
@Data
@Table(name = "users")
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    private int id;

    private String login;

    private String password;

    @Column(name = "e_mail")
    private String eMail;

    @Column(name = "creation_date")
    private ZonedDateTime  creationDate;

    private String role;
}
