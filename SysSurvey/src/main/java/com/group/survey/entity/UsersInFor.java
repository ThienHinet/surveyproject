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
import org.springframework.data.annotation.Id;

/**
 *
 * @author thienha
 */
@Entity(name = "USER_INFO")
public class UsersInFor implements Serializable
{
    @Id
    @GeneratedValue
    @javax.persistence.Id
    private long usersId;

    private String userName;
    
    private String passWord;
    private String fullName;
   
    private String usersType;
  
    private Integer status;

    public UsersInFor() {
    }

    public UsersInFor(long usersId, String userName, String passWord, String fullName, String usersType, Integer status) {
        this.usersId = usersId;
        this.userName = userName;
        this.passWord = passWord;
        this.fullName = fullName;
        this.usersType = usersType;
        this.status = status;
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
    
    
}
