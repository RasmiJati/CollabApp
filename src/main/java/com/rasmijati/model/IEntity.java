/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.model;

/**
 *
 * @author rasmi
 */
public interface IEntity {
    Long getId();
    void setId(Long id);
    //IEntity interface is created to compare id provided by user and id present in our list/ database for the purpose of showbyid in abstract repository
}
