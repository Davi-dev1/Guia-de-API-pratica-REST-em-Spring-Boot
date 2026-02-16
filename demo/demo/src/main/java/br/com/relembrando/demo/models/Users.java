package br.com.relembrando.demo.models;

import com.fasterxml.jackson.annotation.JsonFormat;
import jakarta.persistence.*;

import java.time.LocalDate;
import java.util.Date;
import java.time.format.DateTimeFormatter;


@Entity
@Table(name="users")

public class Users {



@Id
 @GeneratedValue(strategy = GenerationType.IDENTITY )
    @Column(name = "user_id")
    private int userid;

private String users;

private String pass;

private String cpf;


private LocalDate brhitday;

    public int getUserid() {
        return userid;
    }

    public void setUserid(int userid) {
        this.userid = userid;
    }

    public String getUsers() {
        return users;
    }

    public void setUsers(String users) {
        this.users = users;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public LocalDate getBrhitday() {
        return brhitday;
    }

    public void setBrhitday(LocalDate brhitday) {
        this.brhitday = brhitday;
    }




}
