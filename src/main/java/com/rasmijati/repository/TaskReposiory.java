/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.repository;

import com.rasmijati.model.Task;

/**
 *
 * @author rasmi
 */
public class TaskReposiory extends AbstractRepository<Task>{
    @Override
    public void Edit(Task t){
        this.ShowAll().stream().filter(n->n.getId().equals(t.getId())).forEach(x->{
            x.setTaskName(t.getTaskName());
            x.setDescription(t.getDescription());
            x.setDueDate(t.getDueDate());
            x.setPriority(t.getPriority());
            x.setStatus(t.getStatus());
            x.setAssignedUser(t.getAssignedUser());
        });
    }
}
