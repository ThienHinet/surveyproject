/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.group.survey.entity;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Table;
import org.springframework.data.annotation.Id;

/**
 *
 * @author thienha
 */
@Entity(name = "UsersInFor")
@Table(name ="USER_INFO" )
public class UsersInFor implements Serializable
{
    @Id
    @GeneratedValue
    @javax.persistence.Id
    @Column(name="USER_ID")
    private long usersId;
    @Column(name="USER_NAME")
    private String userName;
    @Column(name="PASS_WORD")
    private String passWord;
    @Column(name="FULL_NAME")
    private String fullName;
    @Column(name="USER_TYPE")
    private String usersType;
    @Column(name="STATUS")
    private Integer status;
    @Column(name="EMAIL")
    private String email;
    @Column(name="NUMBER_PHONE")
    private String numberphone;

    public UsersInFor() {
    }

    public UsersInFor(long usersId, String userName, String passWord, String fullName, String usersType, Integer status, String email, String numberphone) {
        this.usersId = usersId;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.usersType = usersType;
        this.status = status;
        this.email = email;
        this.numberphone = numberphone;
    }

  
    
    public long getUsersId() {
        return usersId;
    }
    public void setUsersId(long usersId) {
        this.usersId = usersId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public String getUsersType() {
        return usersType;
    }

    public void setUsersType(String usersType) {
        this.usersType = usersType;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getNumberphone() {
        return numberphone;
    }

    public void setNumberphone(String numberphone) {
        this.numberphone = numberphone;
    }
    
    
}
