/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.User;

/**
 *
 * @author rasmi
 */
public class UserRepository extends AbstractRepository<User>{
    @Override
    public void Edit(User u){
        this.ShowAll().stream().filter(n->n.getId().equals(u.getId())).forEach(x->{
            x.setUsername(u.getUsername());
            x.setEmail(u.getEmail());
            x.setPassword(u.getPassword());
        });
    }
}
