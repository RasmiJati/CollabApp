/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.IEntity;
import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author rasmi
 * @param <T>
 */
public class AbstractRepository<T extends IEntity> {

    private List<T> list;

    public AbstractRepository() {
        this.list = new ArrayList<>();
    }

    public void Create(T t) {
        this.list.add(t);
    }

    public List<T> ShowAll() {
        return list;
    }
    
    public T ShowById(Long id){
        for(T e : list){
            if(e.getId().equals(id)) //IEntity interface is created to compare id provided by user and id present in our list/ database
                return e;
        }
        return null;
    }
    
    public void Delete(T t){
        this.list.remove(t);
    }
    
    public void Edit(T t){
        
    }
}
