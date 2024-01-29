/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.rasmijati.controller;

import com.rasmijati.model.User;
import com.rasmijati.repository.UserRepository;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class UserController {

    private static UserRepository userRepository;

    public void Option(UserRepository userRepository) {
        this.userRepository = userRepository;
        String choice;
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println();
            System.out.println();
            System.out.println("**********User Operation*************");
            System.out.println();
            System.out.println("Select Any Operation : ");
            System.out.println("1 for create :");
            System.out.println("2 for display :");
            System.out.println("3 for delete :");
            System.out.println("4 for edit : ");
            System.out.println("5 for exit : ");
            System.out.println();
            System.out.println("Enter your choice : ");
            choice = sc.next();
            switch (choice) {
                case "1":
                    Create();
                    break;
                case "2":
                    ShowAll();
                    break;
                case "3":
                    Delete();
                    break;
                case "4":
                    Edit();
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid Option!!!");
                    break;
            }

        } while (!(choice.equals("0")));
    }

    public static void Create() {
        Long id = null;
        String username = null;
        String email = null;
        String password = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("---------Performing Create Operation-----------");

        while (id == null) {
            System.out.println("Enter id :");
            id = sc.nextLong();
        }

        while (username == null || username.isEmpty()) {
            System.out.println("Enter user name : ");
            username = sc.next();
        }

        while (email == null || email.isEmpty()) {
            System.out.println("Enter email : ");
            email = sc.next();
        }

        while (password == null || password.isEmpty()) {
            System.out.println("Enter password : ");
            password = sc.next();
        }
        User user = new User(id, username, email, password);
        userRepository.Create(user);
        System.out.println("Create Successfully!!!!");
    }

    public static void ShowAll() {
        System.out.println("*****User's Information********");
        userRepository.ShowAll().stream().forEach(x -> System.out.println(x));
        System.out.println();
    }

    public static void Delete() {
        Long id;
        Scanner sc = new Scanner(System.in);
        System.out.println("--------Performing Delete Operation----------");
        System.out.println("Enter id : ");
        id = sc.nextLong();
        User u = userRepository.ShowById(id);
        while (u == null) {
            System.out.println("Delete Failed!!!");
            System.out.println("Id " + id + " not found!");
            System.out.println("Please enter valid id !!");
            return;
        }
        userRepository.Delete(u);
        System.out.println("Delete Successfully!!!");
    }

    public static void Edit() {
        Long id = null;
        String username = null;
        String email = null;
        String password = null;

        Scanner sc = new Scanner(System.in);
        System.out.println("---------Performing Create Operation-----------");

        while (id == null) {
            System.out.println("Enter id :");
            id = sc.nextLong();
            User u = userRepository.ShowById(id);
            while (u == null) {
                System.out.println("Delete Failed!!!");
                System.out.println("Id " + id + " not found!");
                System.out.println("Please enter valid id !!");
                return;
            }
        }

        while (username == null || username.isEmpty()) {
            System.out.println("Enter user name : ");
            username = sc.next();
        }

        while (email == null || email.isEmpty()) {
            System.out.println("Enter email : ");
            email = sc.next();
        }

        while (password == null || password.isEmpty()) {
            System.out.println("Enter password : ");
            password = sc.next();
        }
        User user = new User(id, username, email, password);
        userRepository.Edit(user);
        System.out.println("Edit Successfully!!");
    }
}
