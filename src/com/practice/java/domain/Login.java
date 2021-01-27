
package com.practice.java.domain;

import java.util.Scanner;

public class Login {
    public boolean login(Account account){
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Username : ");
        String username = scanner.nextLine();
        
        System.out.print("Password : ");
        String password = scanner.nextLine();
        
        if(account.getUsername().equals(username) && account.getPassword().equals(password)){
            return true;
        } else{
            return false;
        }
    }
}
