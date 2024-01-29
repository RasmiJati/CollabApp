/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.rasmijati.controller;

import com.rasmijati.repository.UserRepository;
import java.util.Scanner;

/**
 *
 * @author rasmi
 */
public class MainController {

    public static void main(String[] args) {
        UserController userController = new UserController();
        UserRepository userRepository = new UserRepository();

        String choice;
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println();
            System.out.println("Select Any Operation : ");
            System.out.println("1 for user :");
            System.out.println("2 for  :");
            System.out.println("3 for  :");
            System.out.println("4 for  : ");
            System.out.println("5 for  : ");
            System.out.println();
            System.out.println();
            System.out.println("Enter your choice : ");
            choice = sc.next();
            switch (choice) {
                case "1":
                    userController.Option(userRepository);
                    break;
                case "2":
                    break;
                case "3":
                    break;
                case "4":
                    break;
                case "5":
                    return;
                default:
                    System.out.println("Invalid Option!!!");
                    break;
            }
        } while (!(choice.equals("0")));
    }
}
