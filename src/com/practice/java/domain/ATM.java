package com.practice.java.domain;

import java.util.Scanner;

public class ATM {

    public void startAtm(Account account) {
        Login login = new Login();

        Scanner scanner = new Scanner(System.in);

        System.out.println("*************************");
        System.out.println("Welcome The Software Bank");
        System.out.println("*************************");

        System.out.println("-------------------------");
        System.out.println("User Login");
        System.out.println("-------------------------");

        int rightOfEntry = 3;

        while (true) {
            if (login.login(account)) {

                System.out.println("Successful Login");
                break;
            } else {

                System.out.println("Username or Password incorrect");
                rightOfEntry--;

                if (rightOfEntry == 0) {
                    System.out.println("Your Account has blocked");
                    System.exit(0);
                } else {
                    System.out.println("Right of Entry : " + rightOfEntry);
                    continue;
                }
            }

        }
        String operations = "1 - Display Balance\n"
                + "2 - Deposit Money\n"
                + "3 - Withdraw Money\n"
                + "q - Quit";

        System.out.println("-------------------------");
        System.out.println("OPERATIONS");
        System.out.println("-------------------------");
        
        while(true){
            System.out.println(operations);
            
            System.out.print("Please Select an operation : ");
            String operation = scanner.nextLine();
        
            if(operation.equals("1")){
                
                System.out.println("Balance : " + account.getBalance());
            
            } else if(operation.equals("q")){
                System.out.println("The program quits");
                break;
            } else if(operation.equals("2")){
                System.out.print("Amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                
                account.depositMoney(amount);
                
            } else if(operation.equals("3")){
                System.out.print("Amount : ");
                int amount = scanner.nextInt();
                scanner.nextLine();
                
                account.withdrawMoney(amount);
            }
        
        }
        

    }
}
