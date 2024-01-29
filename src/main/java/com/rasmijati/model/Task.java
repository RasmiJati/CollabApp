/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.model;

/**
 *
 * @author rasmi
 */
import java.time.LocalDate;
import java.util.Objects;

public class Task implements IEntity{

    private Long id;

    private String taskName;

    private String description;

    private LocalDate dueDate;

    private Priority priority;

    private TaskStatus status;

    private User assignedUser;

    public Task() {
    }

    public Task(String taskName, String description, LocalDate dueDate, Priority priority) {
        this.taskName = taskName;
        this.description = description;
        this.dueDate = dueDate;
        this.priority = priority;
        this.status = TaskStatus.OPEN; // Default status when a task is created
    }

    @Override
    public Long getId() {
        return id;
    }

    @Override
    public void setId(Long Id) {
        this.id = Id;
    }

    public String getTaskName() {
        return taskName;
    }

    public void setTaskName(String taskName) {
        this.taskName = taskName;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LocalDate getDueDate() {
        return dueDate;
    }

    public void setDueDate(LocalDate dueDate) {
        this.dueDate = dueDate;
    }

    public Priority getPriority() {
        return priority;
    }

    public void setPriority(Priority priority) {
        this.priority = priority;
    }

    public TaskStatus getStatus() {
        return status;
    }

    public void setStatus(TaskStatus status) {
        this.status = status;
    }

    public User getAssignedUser() {
        return assignedUser;
    }

    public void setAssignedUser(User assignedUser) {
        this.assignedUser = assignedUser;
    }

    @Override
    public final int hashCode() {
        int hash = 5;
        hash = 67 * hash + Objects.hashCode(this.id);
        hash = 67 * hash + Objects.hashCode(this.taskName);
        hash = 67 * hash + Objects.hashCode(this.description);
        hash = 67 * hash + Objects.hashCode(this.dueDate);
        hash = 67 * hash + Objects.hashCode(this.priority);
        hash = 67 * hash + Objects.hashCode(this.status);
        hash = 67 * hash + Objects.hashCode(this.assignedUser);
        return hash;
    }

    @Override
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }

        if (!(obj instanceof Task)) {
            return false;
        }
        final Task other = (Task) obj;
        if (!Objects.equals(this.taskName, other.taskName)) {
            return false;
        }
        if (!Objects.equals(this.description, other.description)) {
            return false;
        }
        if (!Objects.equals(this.id, other.id)) {
            return false;
        }
        if (!Objects.equals(this.dueDate, other.dueDate)) {
            return false;
        }
        if (this.priority != other.priority) {
            return false;
        }
        if (this.status != other.status) {
            return false;
        }
        return Objects.equals(this.assignedUser, other.assignedUser);
    }

    @Override
    public String toString() {
        return "Task{" + "taskId=" + id + ", taskName=" + taskName + ", description=" + description + ", dueDate=" + dueDate + ", priority=" + priority + ", status=" + status + ", assignedUser=" + assignedUser + '}';
    }

}
