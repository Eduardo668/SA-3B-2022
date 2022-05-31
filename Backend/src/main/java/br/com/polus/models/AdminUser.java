package br.com.polus.models;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@Entity(name = "adm_user")
public class AdminUser {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "adm_username")
    @NotNull
    @Size(max = 100)
    private String admUsername;


    @Column(name = "adm_password")
    @NotNull
    @Size(max = 100)
    private String password;


    public AdminUser(){

    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getAdmUsername() {
        return admUsername;
    }

    public void setAdmUsername(String admUsername) {
        this.admUsername = admUsername;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "AdminUser{" +
                "id=" + id +
                ", admUsername='" + admUsername + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
